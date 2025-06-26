package com.permit.backend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    public String login(@RequestBody LoginRequest request) {
        // In real app, you'd check username/password
        if ("admin".equals(request.getUsername()) && "password".equals(request.getPassword())) {
            return "Login successful!";
        } else {
            return "Invalid credentials!";
        }
    }

    static class LoginRequest {
        private String username;
        private String password;

        // Getters and setters
        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
    }
}


