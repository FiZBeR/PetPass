package com.proyecto.portafolio.petpass.dto;

import java.time.LocalDate;

public record PetResponse(
        String id,
        String nombre,
        String especie,
        String raza,
        LocalDate nacimiento
) {
}
