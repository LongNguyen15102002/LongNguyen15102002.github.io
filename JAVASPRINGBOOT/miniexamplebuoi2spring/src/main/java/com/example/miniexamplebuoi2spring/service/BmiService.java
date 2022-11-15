package com.example.miniexamplebuoi2spring.service;

import com.example.miniexamplebuoi2spring.exception.BadRequestException;
import com.example.miniexamplebuoi2spring.model.Bmi;
import org.springframework.stereotype.Service;

@Service
public class BmiService {
    public double calculateBmi(double weight, double height) {
        if (weight > 0 && height > 0){
            double BMI = weight / (height*height);
            return BMI;
        } else throw new BadRequestException("In4 k hợp lệ");

    }
}
