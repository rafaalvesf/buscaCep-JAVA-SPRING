package com.luizalabs.luizalabs.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
    private String message = "CEP inválido";
}