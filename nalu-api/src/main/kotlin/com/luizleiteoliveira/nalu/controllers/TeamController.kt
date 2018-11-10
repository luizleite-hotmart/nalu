package com.luizleiteoliveira.nalu.controllers

import com.luizleiteoliveira.nalu.repositories.TeamRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value="/teams")
class TeamController @Autowired constructor() {

    val teamRepository: TeamRepository

    @PostMapping
    fun createTeam(@RequestParam (value = "name", defaultValue = "Luiz") name: String) : String {
        val newTeam = TeamRepository
        return "seja bem vindo $name"
    }

}