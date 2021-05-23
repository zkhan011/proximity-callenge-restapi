package com.example.easyrest.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/")
public class IndexController {
	//@PreAuthorize("hasRole('instructor')")  
    @GetMapping
    public String sayHello() {
        return "Hello and Welcome to the webinar search application application.";
    }
}
