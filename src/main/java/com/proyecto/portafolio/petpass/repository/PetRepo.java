package com.proyecto.portafolio.petpass.repository;

import com.proyecto.portafolio.petpass.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PetRepo extends JpaRepository<Pet, String> {

    List<Pet> findByOwner(String owner);
    Optional<Pet> findByIdAndOwnerId(String id, String ownerId);
}
