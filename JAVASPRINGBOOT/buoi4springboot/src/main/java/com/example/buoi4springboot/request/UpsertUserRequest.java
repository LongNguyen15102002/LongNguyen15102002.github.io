package com.example.buoi4springboot.request;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor

public class UpsertUserRequest {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String avatar;
    private String password;
}
