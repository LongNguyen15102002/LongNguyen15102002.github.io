package com.example.course.controller;

import com.example.course.dto.CourseDto;
import com.example.course.model.Course;
import com.example.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/courses")  // context-path: /api/v1
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    public List<Course> findAll(
            @Valid @RequestParam(value = "type", required = false) String typeValue,
            @RequestParam(value = "name", required = false) String nameValue,
            @RequestParam(value = "topic", required = false) String topicValue)
    {
        return userService.findAll(typeValue, nameValue, topicValue);
    }

    @GetMapping("/{id}")
    public CourseDto findCourseById(@PathVariable Integer id) {
        return userService.findByid(id);
    }
}