package com.example.btvnbuoi1spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class Job {
    private int id;
    private String title;
    private String description;
    private String location;
    private int minSalary;
    private int maxSalary;
    private String email;
}
