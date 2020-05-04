/*
 * 
 * 
 * if the id is not found then the 
 * exception is thrown and handled here
 * and the respective message is send
 * 
 */




package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)


public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}