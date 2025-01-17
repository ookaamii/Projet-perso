package com.project.back.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Représente les "filmothèques" des utilisateurs dans la base de données.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users_films")
public class UserFilm {

    /**
     * Identifiant unique
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Relation Many-to-One avec l'entité User
     * Associé à un utilisateur
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    /**
     * Relation Many-to-One avec l'entité Film
     * Associé à un film
     */
    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    /**
     * Relation Many-to-One avec l'entité Action
     * Associé à une action
     */
    @ManyToOne
    @JoinColumn(name = "action_id")
    private Action action;

}
