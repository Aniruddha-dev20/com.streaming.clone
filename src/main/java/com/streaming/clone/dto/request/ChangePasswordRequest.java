package com.streaming.clone.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ChangePasswordRequest {

    @NotBlank(message = "Current Password is Required")
    private String currentPassword;

    @NotBlank(message = "New Password is Required")
    private String newPassword;
}
