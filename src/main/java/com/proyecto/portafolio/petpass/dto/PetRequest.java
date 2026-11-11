package com.proyecto.portafolio.petpass.dto;

import java.time.LocalDate;

public record PetRequest(
        String name,
        String specie,
        String raza,
        LocalDate nacimineto
) {
}
