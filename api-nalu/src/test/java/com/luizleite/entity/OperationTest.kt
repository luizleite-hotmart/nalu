package com.luizleite.entity

import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test

import java.util.Date
import kotlin.test.assertEquals

@QuarkusTest
class OperationTest {

    @Test
    fun `create operation class like user`() {
        var operation = Operation("STOK-CODE", Date(), 5L, 15.3, 0.5, "Broker")
        assertEquals(operation.stockName, "STOK-CODE")
        assertEquals(operation.count, 5L)
        assertEquals(operation.value, 15.3)
        assertEquals(operation.taxes, 0.5)
        assertEquals(operation.broker, "Broker")
    }

    @Test
    fun `create operation class like user without tax`() {
        var operation = Operation("STOK-CODE", Date(), 5L, 15.3, "Broker")
        assertEquals(operation.stockName, "STOK-CODE")
        assertEquals(operation.count, 5L)
        assertEquals(operation.value, 15.3)
        assertEquals(operation.taxes, 0.0)
        assertEquals(operation.broker, "Broker")
    }

}
