package com.luizleiteoliveira.nalu.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value="/teams")
class TeamController @Autowired constructor() {




    @GetMapping
    fun createTeam(@RequestParam (value = "name", defaultValue = "Luiz") name: String) : String {
        return "seja bem vindo $name"
    }

}