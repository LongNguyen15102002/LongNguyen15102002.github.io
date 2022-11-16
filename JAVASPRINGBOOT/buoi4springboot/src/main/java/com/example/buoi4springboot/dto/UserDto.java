package com.example.buoi4springboot.dto;

import lombok.*;
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor

public class UserDto {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String avatar;
}
