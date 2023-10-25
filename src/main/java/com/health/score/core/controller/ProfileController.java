package com.health.score.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ProfileController {
	@GetMapping
    public String hello() {
        return "Welcome to Heroku1";
    }

}
