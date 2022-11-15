package com.example.btvnbuoi2spring.controller;

import com.example.btvnbuoi2spring.model.User;
import com.example.btvnbuoi2spring.dto.UserDto;
import com.example.btvnbuoi2spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public UserDto login(@RequestParam("username") String username,
                         @RequestParam("password") String password) {
        return userService.findUser(username, password);
    }
}