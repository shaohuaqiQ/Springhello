package com.example.helloWorld.model;

public class JwtResponse {

    private String token;

    public JwtResponse(String token) {
        this.token = token;
    }

    // Getter

    public String getToken() {
        return token;
    }

}

