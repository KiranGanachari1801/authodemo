package com.Encora.authdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @GetMapping
    public ResponseEntity<?> getDashboard(Authentication authentication) {
        return ResponseEntity.ok("Welcome to Dashboard, " + authentication.getName());
    }
}
