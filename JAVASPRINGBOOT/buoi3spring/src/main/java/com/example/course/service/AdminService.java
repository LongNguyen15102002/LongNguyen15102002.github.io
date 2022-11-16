package com.example.course.service;

import com.example.course.exception.NotFoundException;
import com.example.course.model.Course;
import com.example.course.repository.CourseRepository;
import com.example.course.repository.UserRepository;
import com.example.course.request.UpsertCourseRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    public List<Course> findAllCourse() {
        return courseRepository.findAll();
    }

    public Course save(UpsertCourseRequest request) {
        Course newCourse = new Course(0,
                request.getName(),
                request.getDescription(),
                request.getType(),
                request.getTopics(),
                request.getThumbnail(),
                request.getUserId()
        );
        return courseRepository.save(newCourse);
    }

    public Course updateCourse(UpsertCourseRequest request, Integer id) {
        Course course = courseRepository.findById(id).orElseThrow(() -> new NotFoundException("Id không tồn tại: " + id));
        if (request.getName() != null ) course.setName(request.getName());
        if(request.getDescription() != null) course.setDescription(request.getDescription());
        if(request.getThumbnail() != null) course.setThumbnail(request.getThumbnail());
        if (request.getTopics() != null) course.setTopics(request.getTopics());
        if (request.getType() != null) course.setType(request.getType());
        if (request.getUserId() != null) course.setUserId(request.getUserId());

        return course;
    }

    public ResponseEntity<Void> deleteCourse(Integer id) {
        courseRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}