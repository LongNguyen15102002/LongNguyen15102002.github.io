package com.example.demobean;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Random;

//@AllArgsConstructor
@Component
@RequiredArgsConstructor
public class People {
    private final Student student;
    private final Random random;

//    public People(Student student, Random random) {
//        this.student = student;
//        this.random = random;
//    }
}
