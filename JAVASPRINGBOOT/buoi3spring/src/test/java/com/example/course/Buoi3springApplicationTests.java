package com.example.course;

import com.example.course.controller.UserController;
import com.example.course.dto.CourseDto;
import com.example.course.model.Course;
import com.example.course.model.User;
import com.example.course.repository.CourseRepository;
import com.example.course.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MiniprojectApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private UserController userController;

    @Test
    void contextLoads() {
    }

    @Test
    void showUser() {
        List<User> users = userRepository.findAll();
        users.forEach(System.out::println);
    }

    @Test
    void showCourse() {
        List<Course> courses = courseRepository.findAll();
        courses.forEach(System.out::println);
    }

    @Test
    void showDetailledCourse() {
        CourseDto courseDto = userController.findCourseById(3);
        System.out.println(courseDto.toString());
    }


}