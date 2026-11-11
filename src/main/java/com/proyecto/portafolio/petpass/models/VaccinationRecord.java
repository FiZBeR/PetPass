package com.proyecto.portafolio.petpass.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "vaccination_records", indexes = {
        @Index(name = "idx_vac_records_pet_id", columnList = "pet_id"),
        @Index(name = "idx_vac_records_next_due_on", columnList = "next_due_on")
})
@Getter
@Setter
@NoArgsConstructor
public class VaccinationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String nombreVacuna;

    @Column(nullable = false)
    private String administradoPor;

    @Column(nullable = false)
    private LocalDate siguienteVacuna;

    @Column(nullable = false)
    private String nombreVet;

    private LocalDate nextDueOn;

    @Column(nullable = false)
    private String fuente;

    @CreationTimestamp
    @Column(nullable = false)
    private Instant cratedAt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pet_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Pet mascota;
}
