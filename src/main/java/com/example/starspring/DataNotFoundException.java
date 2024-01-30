package com.example.starspring;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entitiy not found")
public class DataNotFoundException extends RuntimeException{
    private static final long serilVersionUID = 1L;
    public DataNotFoundException(String message){
        super(message);
    }
}
