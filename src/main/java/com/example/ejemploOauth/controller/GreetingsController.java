package com.example.ejemploOauth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("denyAll()")
public class GreetingsController {
    @GetMapping("/sayhi")
    @PreAuthorize("permitAll()")
    public String sayHi(){
        return "Hi, this is a not secured endpoint";
    }

    @GetMapping("/sayhisec")
    @PreAuthorize("isAuthenticated()")
    public String sayHiSec(){
        return "Hi, this is a  secured endpoint";
    }
}
