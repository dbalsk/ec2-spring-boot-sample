package com.example.ec2springbootsample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public ResponseEntity health(){
        return ResponseEntity.status(HttpStatus.OK).body("Success health check");
    }

    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }
}
