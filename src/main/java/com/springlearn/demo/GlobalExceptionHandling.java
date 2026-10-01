package com.springlearn.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice 
public class GlobalExceptionHandling {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> handleValidation(MethodArgumentNotValidException ex){

        String message = ex.getBindingResult().getFieldError().getDefaultMessage();

        ApiError error = new ApiError();
        error.setStatus(400);
        error.setMessage(message);
        error.setTimestamp(java.time.LocalDateTime.now().toString());

        return ResponseEntity.badRequest().body(error);

    }
   
}
