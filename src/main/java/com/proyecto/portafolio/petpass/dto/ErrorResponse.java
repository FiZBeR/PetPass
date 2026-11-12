package com.proyecto.portafolio.petpass.dto;

import java.time.LocalDateTime;

public record ErrorResponse(
        String mensaje,
        String error,
        int status,
        LocalDateTime timestamp
) {
}
