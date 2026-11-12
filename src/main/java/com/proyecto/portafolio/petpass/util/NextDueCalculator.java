package com.proyecto.portafolio.petpass.util;

import com.proyecto.portafolio.petpass.exceptions.GlobalExceptionHandler;

import java.time.LocalDate;

public class NextDueCalculator {

    public LocalDate NextDueCalculator(LocalDate fecha, int dias){

        //Validar que la fecha sea correcta
        if(fecha == null){
            throw  new IllegalArgumentException("La fecha no puede ser nula");
        }

        if(dias <= 0){
            throw new IllegalArgumentException("Los dias no pueden ser 0 o menor a 0");
        }

        LocalDate nextDue = fecha.plusDays(dias);
        return nextDue;
    }
}
