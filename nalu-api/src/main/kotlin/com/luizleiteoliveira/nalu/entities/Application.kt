package com.luizleiteoliveira.nalu.entities

import kotlinx.nosql.string
import kotlinx.nosql.mongodb.DocumentSchema

object Applications : DocumentSchema<Application>("applications", Application::class) {
    val name = string("name")
    val active = string("active")

    init {
        ensureIndex(text = arrayOf(name, active))
    }
}

data class Application(val name: String, val active: Boolean)