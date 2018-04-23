package com.luizleiteoliveira.nalu.controllers

import com.luizleiteoliveira.nalu.entities.Application
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/applications")
class ApplicationController @Autowired constructor(val db: MongoDB){

    @RequestMapping(value = "/add" , method = arrayOf(RequestMethod.POST))
    fun add(@RequestParam("name") name: String): String {
        db.
    }

}