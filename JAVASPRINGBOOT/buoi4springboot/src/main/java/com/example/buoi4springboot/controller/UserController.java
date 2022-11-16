package com.example.buoi4springboot.controller;

import com.example.buoi4springboot.dto.UserDto;
import com.example.buoi4springboot.model.User;
import com.example.buoi4springboot.request.UpsertUserRequest;
import com.example.buoi4springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("user")
    public List<User> findAll(){
        return userService.findAllUsers();
    }
    @GetMapping("user/{id}")
    public UserDto findById(@PathVariable Integer id){
        return userService.findById(id);
    }

    @GetMapping("user/name")
    public UserDto findByName(@PathVariable String name){
        return userService.findByName(name);
    }

    @PostMapping("user")
    public User createUser(@RequestBody UpsertUserRequest request){
        return userService.createUser(request);
    }

    @PutMapping("user/{id}")
    public User updateUserById(@PathVariable int id, @RequestBody UpsertUserRequest request){
        return userService.updateUserById(id, request);
    }

    @DeleteMapping("user/{id}")
    public void deleteUserById(@PathVariable int id){
        userService.deleteUserById(id);
    }

    @PutMapping("user/{id}/update-avatar")
    public void updateUserAvatarById(@PathVariable int id, @RequestBody UpsertUserRequest request){
        userService.updateUserAvatarById(id, request);
    }

    @PutMapping("user/{id}/update-password")
    public void changeUserPasswordById(@PathVariable int id, UpsertUserRequest request,@PathVariable String newPassword){
        userService.changeUserPasswordById(id, request, newPassword);
    }

    @PostMapping("user/{id}/forgot-password")
    public String forgotUserPassword(@PathVariable int id, @PathVariable String newPassword, UpsertUserRequest request){
        return userService.forgotUserPassword(id, newPassword, request);
    }
}
