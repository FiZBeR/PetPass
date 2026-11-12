package com.proyecto.portafolio.petpass.exceptions;

import com.proyecto.portafolio.petpass.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> manejarRunTimeException(RuntimeException ex){
        System.out.println("Fallo de negocio detectado: {}" + ex.getMessage() + ex);
        ErrorResponse error = new ErrorResponse(
                ex.getMessage(),
                "Bad Request - Logica de negocio",
                HttpStatus.BAD_REQUEST.value(),
                LocalDateTime.now()
        );

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}
