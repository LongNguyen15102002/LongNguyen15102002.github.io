package com.example.miniexamplebuoi2spring.request;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Password is required")
    @Min(value = 4)
    private String password;
}
