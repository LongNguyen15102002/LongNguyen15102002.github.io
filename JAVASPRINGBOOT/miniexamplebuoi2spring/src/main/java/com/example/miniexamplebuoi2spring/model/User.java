package com.example.miniexamplebuoi2spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private String avatar;
}
