package com.kaiser.hello

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*
import kotlin.math.*

@SpringBootApplication
class HelloApplication

fun main(args: Array<String>) {
    runApplication<HelloApplication>(*args)
}


@RestController
class HelloController {
    @GetMapping("/helloWorld")
    fun healthCheck(): Map<String, Any> {
        return mapOf("data" to "I am ALive!!")
    }

    @RequestMapping(path = ["/addition/{x}/{y}"], method = [RequestMethod.GET])
    fun add(@PathVariable x: Int, @PathVariable y: Int): Map<String, Any> {
        return mapOf("data" to "Sum of $x and $y is ${x + y}")
    }

    @RequestMapping(path = ["/division/{x}/{y}"], method = [RequestMethod.GET])
    fun div(@PathVariable x: Int, @PathVariable y: Int): Map<String, Any> {
        return return mapOf("data" to "Quotient of $x by $y is ${x / y}")
    }
}