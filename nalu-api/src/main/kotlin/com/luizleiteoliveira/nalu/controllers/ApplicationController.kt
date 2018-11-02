package com.luizleiteoliveira.nalu.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/applications")
class ApplicationController @Autowired constructor(){

    @RequestMapping(value = "/add" , method = arrayOf(RequestMethod.POST))
    fun add(@RequestParam("name") name: String): String {
        return "OK"
    }

}