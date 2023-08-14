package com.example.userservice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/first-service")
class UserController {

    @GetMapping("/welcome")
    fun welcome(): String {
        return "Welcome to the First service."
    }

}
