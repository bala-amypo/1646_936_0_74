package com.example.demo.exception;

import org.springframework.web.bind.annotaion.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class GlobalException{

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<String>handleValidationException(ValidationException ex){
        return new ResponseBody<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);
    }
}