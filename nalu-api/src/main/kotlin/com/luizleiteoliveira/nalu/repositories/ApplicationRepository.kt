package com.luizleiteoliveira.nalu.repositories

import com.luizleiteoliveira.nalu.entities.Application
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface  ApplicationRepository : MongoRepository<Application, Long> {

    fun findAllActiveApplications(pageable: Pageable): Page<Application>
}