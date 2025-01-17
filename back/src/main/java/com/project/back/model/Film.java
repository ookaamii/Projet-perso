package com.project.back.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

/**
 * Représente un film dans la base de données.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "films")
public class Film {

    /**
     * Identifiant unique du film
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nom du film qui ne doit pas être null
     */
    @Column(nullable = false)
    private String name;

    /**
     * Résumé du film qui doit être en format text
     */
    @Column(columnDefinition = "TEXT")
    private String resume;

    /**
     * Affiche du film
     */
    private String poster;

    /**
     * Date de sortie du film
     */
    @JsonFormat(pattern="dd-MM-YYYY")
    @Column(name="release_date")
    private LocalDate releaseDate;

    /**
     * Réalisateur(s) du film
     * Relation Many-to-Many avec l'entité Director
     * Un film peut avoir plusieurs réalisateurs et un réalisateur peut avoir plusieurs films
     */
    @ManyToMany
    Set<Director> directors;

    /**
     * Acteur(s) du film
     * Relation Many-to-Many avec l'entité Actor
     * Un film peut avoir plusieurs acteurs et un acteur peut jouer dans plusieurs films
     */
    @ManyToMany
    Set<Actor> actors;

}