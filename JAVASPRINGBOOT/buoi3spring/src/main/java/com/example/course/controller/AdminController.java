package com.example.course.controller;

import com.example.course.dto.CourseDto;
import com.example.course.model.Course;
import com.example.course.request.UpsertCourseRequest;
import com.example.course.service.AdminService;
import com.example.course.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("admin")     // context-path: /api/v1/
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;
    private final UserService userService;

    @GetMapping("/courses")
    public List<Course> findAllCourses () {
        return adminService.findAllCourse();
    }

    @GetMapping("/courses/{id}")
    public CourseDto findDetailCourse(@PathVariable Integer id) {
        return userService.findByid(id);
    }

    @PostMapping("/courses")
    public Course createCourse(@RequestBody @Valid  UpsertCourseRequest request) {
        return adminService.save(request);
    }

    @PutMapping("/courses/{id}")
    public Course updateCourse (@RequestBody UpsertCourseRequest request,
                                @PathVariable Integer id) {
        return adminService.updateCourse(request, id);
    }

    @DeleteMapping("courses/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Integer id) {
        return adminService.deleteCourse(id);
    }
}