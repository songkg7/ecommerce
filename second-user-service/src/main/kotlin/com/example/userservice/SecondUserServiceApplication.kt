package com.example.userservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class SecondUserServiceApplication

fun main(args: Array<String>) {
	runApplication<SecondUserServiceApplication>(*args)
}
