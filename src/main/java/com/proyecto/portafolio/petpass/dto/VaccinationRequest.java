package com.proyecto.portafolio.petpass.dto;

import java.time.LocalDate;

public record VaccinationRequest(
    String nombreVacuna,
    String administradoPor,
    LocalDate nextDueOn,
    String nombreVet
) {
}
