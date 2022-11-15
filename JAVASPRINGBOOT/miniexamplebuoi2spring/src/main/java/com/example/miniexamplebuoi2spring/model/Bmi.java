package com.example.miniexamplebuoi2spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Bmi {
    private double weight;
    private double height;
}
