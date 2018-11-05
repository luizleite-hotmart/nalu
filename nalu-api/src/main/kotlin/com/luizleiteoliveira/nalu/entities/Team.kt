package com.luizleiteoliveira.nalu.entities

import kotlinx.nosql.Id
import kotlinx.nosql.mongodb.DocumentSchema
import kotlinx.nosql.string

object Teams : DocumentSchema<Team>("teams", Team::class) {
    val name = string("name")

    init {
        ensureIndex(text = arrayOf(name))
    }
}

data class Team(val name: String) {
    val id: Id<String, Teams>? = null
}