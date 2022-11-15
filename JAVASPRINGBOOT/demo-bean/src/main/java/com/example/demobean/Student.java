package com.example.demobean;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Component
public class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Autowired
    @Qualifier("bus")
    private Vehicle vehicle;

    public void showVehicle() {
        vehicle.run();
    }
    public void showInfo() {
        System.out.println("Name" + name + " - Email : " + email);
    }

    public void helloStudent() {
        System.out.println("Xin chào Student");
    }
}
