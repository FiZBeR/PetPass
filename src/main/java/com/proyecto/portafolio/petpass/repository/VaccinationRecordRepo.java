package com.proyecto.portafolio.petpass.repository;

import com.proyecto.portafolio.petpass.models.VaccinationRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VaccinationRecordRepo extends JpaRepository<VaccinationRecord, String> {

    List<VaccinationRecord> findByMascotaOrderByAdministradoPorDesc(String id);
    Optional<VaccinationRecord> findByIdAndMascotaOwnerId(String id, String OwnerId);

}
