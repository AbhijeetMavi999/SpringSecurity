package com.example.securitydemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello!";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String sayHelloToUser() {
        return "Hello User!";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String sayHelloToAdmin() {
        return "Hello Admin!";
    }
}
