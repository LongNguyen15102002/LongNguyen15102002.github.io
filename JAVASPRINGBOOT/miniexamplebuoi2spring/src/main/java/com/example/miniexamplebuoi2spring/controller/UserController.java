package com.example.miniexamplebuoi2spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

public class UserController {
    @GetMapping ("/login")
    public UserDto login(@Valid RequestParam LoginRequest request){
        return null;
    }
}
