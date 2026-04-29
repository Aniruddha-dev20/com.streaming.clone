package com.streaming.clone.service;

public interface EmailService {

    void sendVerificationEmail(String toEMail,String token);
    void sendPasswordResetEmail(String toEmail,String token);
}
