package com.luizleiteoliveira.nalu.controllers

import com.luizleiteoliveira.nalu.entities.Application
import com.luizleiteoliveira.nalu.entities.Applications
import kotlinx.nosql.mongodb.MongoDB
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/applications")
class ApplicationController @Autowired constructor(val db: MongoDB){

    @RequestMapping(value = "/add" , method = arrayOf(RequestMethod.POST))
    fun add(@RequestParam("name") name: String): String {
        db.withSession {
            Applications.insert(Application(name, true))
        }
        return "redirect:/owners/"
    }

}