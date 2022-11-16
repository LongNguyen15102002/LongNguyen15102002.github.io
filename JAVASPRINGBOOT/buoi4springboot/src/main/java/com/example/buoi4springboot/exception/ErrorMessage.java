package com.example.buoi4springboot.exception;

import org.springframework.http.HttpStatus;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
    private HttpStatus status;
    private Object message;
}
