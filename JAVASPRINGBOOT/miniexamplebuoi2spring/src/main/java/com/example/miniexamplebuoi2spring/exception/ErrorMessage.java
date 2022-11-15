package com.example.miniexamplebuoi2spring.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class ErrorMessage {
    private HttpStatus status;
    private String message;
}
