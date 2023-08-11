package com.api.conca

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@SpringBootApplication
class ConcaApplication

fun main(args: Array<String>) {
	runApplication<ConcaApplication>(*args)
}
