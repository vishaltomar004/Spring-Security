package com.spring.security.test.SpringSecrityTest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    @GetMapping("/normal")
    public ResponseEntity<String> normalUser(){
        return ResponseEntity.ok("I am normal User");
    }
    @GetMapping("/admin")
    public ResponseEntity<String> adminUser(){
        return ResponseEntity.ok("I am admin User");
    }
    @GetMapping("/public")
    public ResponseEntity<String> publicUser(){
        return ResponseEntity.ok("I am public User");
    }
}
