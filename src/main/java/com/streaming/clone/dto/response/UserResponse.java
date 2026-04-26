package com.streaming.clone.dto.response;

import com.streaming.clone.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private long id;
    private String email;
    private String fullName;
    private String role;
    private boolean acrive;
    private Instant createAt;
    private Instant updateAt;

    public static UserResponse fromEntity(User user){
        return new UserResponse(
                user.getId(),
                user.getEmail(),
                user.getFullName(),
                user.getRole().name(),
                user.isActive(),
                user.getCreatedAt(),
                user.getUpdateAt()
        );
    }
}
