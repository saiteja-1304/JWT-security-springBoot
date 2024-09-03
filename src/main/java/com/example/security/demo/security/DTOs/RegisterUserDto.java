package com.example.security.demo.security.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RegisterUserDto {
    private String email;

    private String password;

    private String fullName;

}
