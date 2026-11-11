package com.proyecto.portafolio.petpass.models;

import com.ethlo.time.DateTime;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pets", indexes = {
        @Index(name = "idx_pets_user_id", columnList = "user_id")
})
@Getter
@Setter
@NoArgsConstructor
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Species especie;

    @Column(nullable = false)
    private String raza;

    @Column(nullable = false)
    private LocalDate nacimiento;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Instant cratedAt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User owner;

    @OneToMany(mappedBy = "pet")
    private List<VaccinationRecord> registro_vac = new ArrayList<>();
}
