package com.luizleite.entity

import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test

import java.util.Date
import kotlin.test.assertEquals

@QuarkusTest
class OperationTest {

    @Test
    fun `create operation class like user`() {
        var operation = Operation("STOCK-CODE", Date(), 5L, 15.3, 0.5, "Broker")
        assertEquals(operation.stockName, "STOCK-CODE")
        assertEquals(operation.count, 5L)
        assertEquals(operation.value, 15.3)
        assertEquals(operation.taxes, 0.5)
        assertEquals(operation.broker, "Broker")
    }

    @Test
    fun `create operation class like user without tax`() {
        var operation = Operation("STOCK-CODE", Date(), 5L, 15.3, "Broker")
        assertEquals(actual = operation.stockName, expected = "STOCK-CODE")
        assertEquals(actual = operation.count, expected = 5L)
        assertEquals(actual = operation.value, expected = 15.3)
        assertEquals(actual = operation.taxes, expected = 0.0)
        assertEquals(actual = operation.broker, expected = "Broker")
    }

    @Test
    fun `create operation class total operation`() {
        var operation = Operation("STOCK-CODE", Date(), 5L, 15.3, 0.5, "Broker")
        assertEquals(actual = operation.calcTotal(), expected = 77.0)
    }

    @Test
    fun `create operation class total operation without taxes`() {
        var operation = Operation("STOCK-CODE", Date(), 5L, 15.3, "Broker")
        assertEquals(actual = operation.calcTotal(), expected = 76.5)
    }

    @Test
    fun `create operation class total operation add field`() {
        var operation = Operation("STOCK-CODE", Date(), 5L, 15.3, 0.5, "Broker")
        assertEquals(actual = operation.total, expected = 77.0)
    }

    @Test
    fun `create operation class total operation add field without taxes`() {
        var operation = Operation("STOCK-CODE", Date(), 5L, 15.3, 0.5, "Broker")
        assertEquals(actual = operation.total, expected = 76.5)
    }
}
