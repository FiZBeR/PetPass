package com.proyecto.portafolio.petpass.repository;

import com.proyecto.portafolio.petpass.models.Species;
import com.proyecto.portafolio.petpass.models.VaccineRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VaccineRuleRepo extends JpaRepository<VaccineRule, String> {

    Optional<VaccineRule> findBynombreVacunaIgnoreCaseAndEspecie(String name, Species especie);
}
