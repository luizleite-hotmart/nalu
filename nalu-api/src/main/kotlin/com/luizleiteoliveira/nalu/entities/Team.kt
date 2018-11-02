package com.luizleiteoliveira.nalu.entities

import kotlinx.nosql.Id
import kotlinx.nosql.mongodb.DocumentSchema
import kotlinx.nosql.string

object Teams : DocumentSchema<Team>("teams", Team::class) {
    val id  = string("id")
    val name = string("name")
}

data class Team(val id: Id<String, Teams>? = null, val name: String)