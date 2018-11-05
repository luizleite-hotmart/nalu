package com.luizleiteoliveira.nalu.services

import com.luizleiteoliveira.nalu.entities.Team
import com.luizleiteoliveira.nalu.entities.Teams
import kotlinx.nosql.mongodb.MongoDB
import org.springframework.beans.factory.annotation.Autowired

class TeamService @Autowired constructor(val database: MongoDB){

    fun addTeam(name: String) {
        database.withSession {
            Teams.insert(Team(name))
        }
    }

    fun findTeamByName(nameParam: String): String {
        var teams = ""
        database.withSession({
            val filteredTeams = Teams.find { name.matches("%$nameParam%".toPattern()) }.toList().toString()
        })
        return teams
    }

}