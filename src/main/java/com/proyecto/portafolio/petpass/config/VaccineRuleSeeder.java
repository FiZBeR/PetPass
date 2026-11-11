package com.proyecto.portafolio.petpass.config;

import com.proyecto.portafolio.petpass.models.Species;
import com.proyecto.portafolio.petpass.models.VaccineRule;
import com.proyecto.portafolio.petpass.repository.VaccineRuleRepo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VaccineRuleSeeder implements ApplicationRunner {

    private final VaccineRuleRepo vaccineRuleRepo;

    public VaccineRuleSeeder(VaccineRuleRepo vaccineRuleRepo) {
        this.vaccineRuleRepo = vaccineRuleRepo;
    }

    @Override
    public void run(ApplicationArguments args){
        if (vaccineRuleRepo.count() == 0) {
            List<VaccineRule> reglasIniciales = List.of(
                    // Reglas para Perros (DOG)
                    crearRegla("Rabia", Species.DOG, 365),
                    crearRegla("Polivalente canina", Species.DOG, 365),
                    crearRegla("Parvovirus", Species.DOG, 365),
                    crearRegla("Leptospirosis", Species.DOG, 365),
                    crearRegla("Tos de las perreras", Species.DOG, 365),

                    // Reglas para Gatos (CAT)
                    crearRegla("Rabia", Species.CAT, 365),
                    crearRegla("Triple felina", Species.CAT, 365),
                    crearRegla("Leucemia felina", Species.CAT, 365)
            );

            vaccineRuleRepo.saveAll(reglasIniciales);
            System.out.println("Seeder: Se han insertado exitosamente las 8 reglas de vacunación iniciales.");
        }
    }

    private VaccineRule crearRegla(String nombreVacuna, Species species, int intervaloDias){
        VaccineRule regla = new VaccineRule();
        regla.setNombreVacuna(nombreVacuna);
        regla.setEspecie(species);
        regla.setIntervaloDias(intervaloDias);
        return regla;
    }
}
