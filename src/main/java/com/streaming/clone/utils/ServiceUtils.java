package com.streaming.clone.utils;

import com.streaming.clone.dao.UserRepository;
import com.streaming.clone.dao.VideoRepository;
import com.streaming.clone.entity.User;
import com.streaming.clone.entity.Video;
import com.streaming.clone.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceUtils {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private VideoRepository videoRepository;

    public User getUserByEmailOrThrow(String email){
        return userRepository
                .findByEmail(email)
                .orElseThrow(()-> new ResourceNotFoundException("User not fund with email: "+email));
    }

    public User getUserByIdOrThrow(Long id){
        return userRepository
                .findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("User not fund with id: "+id));
    }

    public Video getVideoByIdOrThrow(Long id){
        return videoRepository
                .findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Video not found with id"+id));
    }
}
