package com.luizleiteoliveira.nalu.controllers

import com.luizleiteoliveira.nalu.entities.Team

import com.luizleiteoliveira.nalu.services.TeamService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
@RestController
@RequestMapping(value="/teams")
class TeamController {

    private var teamService: TeamService

    @Autowired
    constructor(teamService: TeamService) {
        this.teamService = teamService
    }

    @PostMapping
    fun createTeam(@RequestParam (value = "name", defaultValue = "Luiz") name: String) : Team {
        val newTeam = teamService.createTeam(name)
        return newTeam
    }

    @GetMapping
    fun findTeam(@RequestParam (value = "name", defaultValue = "Luiz") name: String) : List<Team> {
        val teamsFound = teamService.findTeams(name)
        return teamsFound;
    }

}