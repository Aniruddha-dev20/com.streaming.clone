package com.streaming.clone.exception;

import java.awt.event.FocusEvent;

public class EmailSendingException extends RuntimeException {
    public EmailSendingException(String message , Throwable cause){
        super(message, cause);

    }
}
