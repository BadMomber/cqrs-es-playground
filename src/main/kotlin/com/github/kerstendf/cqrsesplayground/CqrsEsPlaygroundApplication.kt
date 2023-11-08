package com.github.kerstendf.cqrsesplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CqrsEsPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<CqrsEsPlaygroundApplication>(*args)
}
