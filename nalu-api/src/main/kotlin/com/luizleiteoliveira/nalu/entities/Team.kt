package com.luizleiteoliveira.nalu.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "team")
data class Team(
        @Id
        val id: String,
        val name: String
        )