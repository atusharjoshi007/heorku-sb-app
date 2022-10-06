package com.example.heorkusbapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String Welcome(){
        return "Welcome to Spring Boot Heroku!!!!";
    }
}
