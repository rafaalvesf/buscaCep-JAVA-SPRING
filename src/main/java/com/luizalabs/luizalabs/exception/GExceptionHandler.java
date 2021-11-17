package com.luizalabs.luizalabs.exception;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GExceptionHandler {

        @ExceptionHandler(Exception.class)
        public ResponseEntity handleException(java.lang.Exception e){
                ErrorDetails errorDetails = new ErrorDetails(e.getMessage());
                return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
        }
}
