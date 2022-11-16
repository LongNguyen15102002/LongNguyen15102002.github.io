package com.example.buoi4springboot;

import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Buoi4springbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Buoi4springbootApplication.class, args);
    }

    @Bean
    public Faker faker() {
        return new Faker();
    }
}
