package com.luizleiteoliveira.nalu.entities

import javax.persistence.*

@Entity
data class Team(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column(nullable = false)
        val name: String
)