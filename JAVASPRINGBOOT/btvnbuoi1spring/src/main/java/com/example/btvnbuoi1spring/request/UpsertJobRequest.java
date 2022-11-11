package com.example.btvnbuoi1spring.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class UpsertJobRequest {
    private String title;
    private String description;
    private String location;
    private int minSalary;
    private int maxSalary;
    private String email;
}
