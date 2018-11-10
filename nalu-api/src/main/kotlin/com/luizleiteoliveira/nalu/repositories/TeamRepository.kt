package com.luizleiteoliveira.nalu.repositories

import com.luizleiteoliveira.nalu.entities.Team
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TeamRepository : MongoRepository<Team, String> {

    fun findTeamByName(name: String) : List<Team>
}

