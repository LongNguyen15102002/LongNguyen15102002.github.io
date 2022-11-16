package com.example.buoi4springboot.model;

import lombok.*;
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String avatar;
    private String password;
}
