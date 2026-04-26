package com.streaming.clone.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank(message = "Current Password is Required")
    @Email(message = "invalid email Format")
    private String email;

    @NotBlank(message = "Password is Required")
    private String password;
}
