package com.luizleite.entity

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertEquals
import java.util.Date

@SpringBootTest
class OperationTest {

    @Test
    fun `create operation class like user`() {
        var operation = Operation("STOCK-CODE", Date(), 5L, 15.3, 0.5, "Broker")
        assertEquals(actual = operation.stockName, expected = "STOCK-CODE")
        assertEquals(actual = operation.count, expected = 5L)
        assertEquals(actual = operation.value, expected = 15.3)
        assertEquals(actual = operation.taxes, expected = 0.5)
        assertEquals(actual = operation.broker, expected = "Broker")
    }

    @Test
    fun `create operation class like user without tax`() {
        var operation = Operation("STOCK-CODE", Date(), 5L, 15.3, "Broker")
        assertEquals(actual = operation.stockName,expected = "STOCK-CODE")
        assertEquals(actual = operation.count,expected =  5L)
        assertEquals(actual = operation.value,expected =  15.3)
        assertEquals(actual = operation.taxes,expected =  0.0)
        assertEquals(actual = operation.broker,expected =  "Broker")
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
        var operation = Operation("STOCK-CODE", Date(), 5L, 15.3, "Broker")
        assertEquals(actual = operation.total, expected = 76.5)
    }
}
