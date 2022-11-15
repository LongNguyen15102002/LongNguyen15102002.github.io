package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.request.LoginRequest;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public UserDto login(@Valid @RequestBody LoginRequest request) {
        return userService.login(request);
    }
}