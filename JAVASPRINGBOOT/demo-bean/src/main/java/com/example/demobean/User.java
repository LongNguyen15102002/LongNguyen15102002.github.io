package com.example.demobean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Component
public class User {
    private String name;
    private String email;

    public void showInfo() {
        System.out.println("Name" + name + " - Email : " + email);
    }

    public void hello() {
        System.out.println("Xin chào");
    }
}
