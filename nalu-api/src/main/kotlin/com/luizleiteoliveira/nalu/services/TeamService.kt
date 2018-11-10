package com.luizleiteoliveira.nalu.services

import com.luizleiteoliveira.nalu.entities.Team
import com.luizleiteoliveira.nalu.repositories.TeamRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class TeamService {
    val teamRepository: TeamRepository

    constructor(teamRepository: TeamRepository) {
        this.teamRepository = teamRepository
    }

    fun createTeam(name: String): Team {
        val now = Date().toInstant()
        val team = Team("$now-$name", name)
        val returnTeam = teamRepository.insert(team)
        return returnTeam
    }

    fun findTeams(name: String): List<Team> {
        return teamRepository.findTeamByName(name)
    }
}