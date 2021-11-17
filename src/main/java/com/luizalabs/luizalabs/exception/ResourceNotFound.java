package com.luizalabs.luizalabs.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
    public class ResourceNotFound extends Exception{

        private static final long serialVersionUID = 1L;

        public ResourceNotFound(String message, HttpStatus notFound){
            super(message);
        }
    }

