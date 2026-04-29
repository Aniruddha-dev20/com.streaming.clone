package com.streaming.clone.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ResetPasswordRequest {

    @NotBlank
    private String token;

    @Size(min = 6, message = "New password must be at least 6 characters long")
    private String newPassword;
}
