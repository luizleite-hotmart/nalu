package com.luizleiteoliveira.apinalu.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.luizleiteoliveira.apinalu.entity.Operation
import org.springframework.stereotype.Component
import java.util.*

@Component
class OperationComponent : GraphQLQueryResolver {
    fun getStocks() = Operation("STOCK-CODE", Date(), 5L, 15.3, 0.5, "Broker")
}