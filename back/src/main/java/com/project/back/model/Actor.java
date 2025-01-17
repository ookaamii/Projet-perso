package com.project.back.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Représente un acteur dans la base de données.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "actors")
public class Actor {

    /**
     * Identifiant unique de l'acteur
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Prénom et Nom de l'acteur qui ne doit pas être null
     */
    @Column(nullable = false)
    private String fullname;

}