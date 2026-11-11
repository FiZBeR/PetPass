package com.proyecto.portafolio.petpass.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nombre;
    private String apellido;
    private int edad;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole rol;

    @Column
    private String totpSecretEncrypted;

    @Column(nullable = false)
    private String totpEnabled;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Instant cratedAt;

    @OneToMany(mappedBy = "owner")
    private List<Pet> mascotas = new ArrayList<>();

}
