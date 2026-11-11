package com.proyecto.portafolio.petpass.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vaccine_rules", uniqueConstraints = {
        @UniqueConstraint(
                name = "uk_vaccine_rule_name_species",
                columnNames = {"vaccine_name", "species"}
        )}
)
@Getter
@Setter
@NoArgsConstructor
public class VaccineRule {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String nombreVacuna;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Species especie;

    @Column(nullable = false)
    private int intervaloDias;

}
