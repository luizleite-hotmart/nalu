package com.luizleiteoliveira.apinalu.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class Version : GraphQLQueryResolver {
    fun version() = "1.0.1"
}