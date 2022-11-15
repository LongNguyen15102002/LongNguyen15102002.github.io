package com.example.btvnbuoi2spring.dto;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class UserDto {
    private String username;
    private String email;
    private String password;
}
