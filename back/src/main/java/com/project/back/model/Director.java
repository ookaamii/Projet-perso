package com.project.back.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Représente un réalisateur dans la base de données.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "directors")
public class Director {

    /**
     * Identifiant unique du réalisateur
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Prénom et Nom du réalisateur qui ne doit pas être null
     */
    @Column(nullable = false)
    private String fullname;

}