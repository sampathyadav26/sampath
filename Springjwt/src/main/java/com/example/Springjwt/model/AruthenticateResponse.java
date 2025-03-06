package com.example.Springjwt.model;

public class AruthenticateResponse {

    private  final String jwt;

    public AruthenticateResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
