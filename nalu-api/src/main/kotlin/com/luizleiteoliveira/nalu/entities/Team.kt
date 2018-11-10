package com.luizleiteoliveira.nalu.entities

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "team")
data class Team(val name: String)