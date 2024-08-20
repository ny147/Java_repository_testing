package com.example.liquibase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("database")
public class LiquibaseController {
    @GetMapping("/hello")
    public String handle() {
        return "hello world";
    }

}
