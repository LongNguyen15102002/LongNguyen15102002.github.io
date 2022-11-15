package com.example.btvnbuoi2spring.model;

import lombok.*;

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
