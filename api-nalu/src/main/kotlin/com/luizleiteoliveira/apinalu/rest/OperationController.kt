package com.luizleiteoliveira.apinalu.rest

import com.luizleiteoliveira.apinalu.entity.Operation
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/operations")
class OperationController {

    @GetMapping
    fun findOperationsFromUser():List<Operation> {
        return listOf(Operation("STOCK-CODE", Date(), 5L, 15.3, 0.5, "Broker"))
    }
}