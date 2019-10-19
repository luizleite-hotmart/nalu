package com.luizleite.entity

import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test

import java.util.Date

@QuarkusTest
class OperationTest {

    @Test
    fun `create operation class like user`() {
        val operation = Operation("STOK-CODE", Date(), 5L, 15.3, 0.5, "Broker")

    }

}
