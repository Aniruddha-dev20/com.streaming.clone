package com.streaming.clone.service;

import com.streaming.clone.dto.request.UserRequest;
import com.streaming.clone.dto.response.MessageResponse;
import com.streaming.clone.dto.response.PageResponse;
import com.streaming.clone.dto.response.UserResponse;

public interface UserService {
    MessageResponse createUser(UserRequest userRequest);

    MessageResponse updateUser(Long id, UserRequest userRequest);

    PageResponse<UserResponse> geyAllUsers(int page, int size, String search);

    MessageResponse deleteUser(Long id, String currentEmailUser);

    MessageResponse toggleUserStatus(Long id, String currentUserEmail);

    MessageResponse changeUserRole(Long id, UserRequest userRequest);
}
