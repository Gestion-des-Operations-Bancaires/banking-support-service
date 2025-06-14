package com.example.support_service.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/transaction")
@CrossOrigin(origins = "*")
public class supportController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from support Service!";
    }
}