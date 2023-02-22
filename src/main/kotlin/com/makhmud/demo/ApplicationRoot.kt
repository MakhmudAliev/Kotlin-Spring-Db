package com.makhmud.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApplicationRoot

fun main(args: Array<String>) {
	println("running")
	runApplication<ApplicationRoot>(*args)
}
