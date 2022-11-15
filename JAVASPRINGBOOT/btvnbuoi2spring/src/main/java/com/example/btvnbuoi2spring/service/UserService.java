package com.example.btvnbuoi2spring.service;

import com.example.btvnbuoi2spring.model.User;
import com.example.btvnbuoi2spring.dto.UserDto;
import com.example.btvnbuoi2spring.exception.BadRequestException;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static User user = new User(1, "admin", "admin@gmail.com", "admin", "avatar");


    public UserDto findUser(String username, String password) {
        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
            return new UserDto(user.getUsername(), user.getEmail(), user.getAvatar());
        }else {
            throw new BadRequestException("username hoặc password chưa chính xác");
        }
    }
}