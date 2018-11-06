package com.luizleiteoliveira.nalu

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages=["com.luizleiteoliveira.nalu"])
class NaluApiApplication

fun main(args: Array<String>) {
    runApplication<NaluApiApplication>(*args)
}
