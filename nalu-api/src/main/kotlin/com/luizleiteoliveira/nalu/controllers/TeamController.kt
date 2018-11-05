package com.luizleiteoliveira.nalu.controllers

import com.luizleiteoliveira.nalu.entities.Team
import com.luizleiteoliveira.nalu.entities.Teams
import kotlinx.nosql.mongodb.MongoDB
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value="/teams")
class TeamController @Autowired constructor(val database: MongoDB) {



    @PostMapping
    fun createTeam(@RequestParam (value = "name", defaultValue = "Luiz") name: String) : String {
        database.withSession {
            Teams.insert(Team(name))
        }
        return "OK"
    }

    @PostMapping
    fun getTeamByName(@RequestParam (value = "name", defaultValue = "Luiz") nameParam: String) : String {
        var teams = ""
        database.withSession({
            val filteredTeams = Teams.find { Teams.name.matches("%$nameParam%".toPattern()) }.toList().toString()
        })
        return teams
    }

}