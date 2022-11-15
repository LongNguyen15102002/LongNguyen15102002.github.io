package com.example.miniexamplebuoi2spring.controller;

import com.example.miniexamplebuoi2spring.service.BmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BmiController {
    @Autowired
    private BmiService bmiService;
    // GET http://localhost:8080/bmi?height=[heightValue]&weight=[weightValue]

    @GetMapping("/bmi")
    public double Bmi (@RequestParam double weight, double height) {
        return bmiService.calculateBmi(weight, height);
    }
}
