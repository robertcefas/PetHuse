package com.example.PetHuse.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class IllegalArgumentException {

    // Corrigido: Agora interceta corretamente a GlobalException
    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<Map<String, String>> tratarAExcecaoPersonalizada(GlobalException ex) {
        Map<String, String> erroResponse = new HashMap<>();
        erroResponse.put("erro", ex.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erroResponse);
    }
}