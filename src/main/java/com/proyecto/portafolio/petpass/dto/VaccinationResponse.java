package com.proyecto.portafolio.petpass.dto;

import java.time.LocalDate;

public record VaccinationResponse(
        String id,
        String nombreVacuna,
        String administradoPor,
        LocalDate nextDueOn,
        String nombreVet,
        String fuente
) {
}
