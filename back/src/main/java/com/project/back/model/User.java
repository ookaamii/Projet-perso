package com.project.back.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/**
 * Représente un utilisateur dans la base de données.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    /**
     * Identifiant unique de l'utilisateur
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Prénom de l'utilisateur qui ne doit pas être null
     */
    @Column(nullable = false)
    private String firstname;

    /**
     * Première lettre du nom de famille de l'utilisateur qui ne doit pas être null
     */
    @Column(nullable = false, name = "lastname_first_caract")
    private String lastnameFirstCaract;

    /**
     * Email de l'utilisateur qui ne doit pas être null
     */
    @Column(nullable = false)
    private String email;

    /**
     * Mot de passe de l'utilisateur qui ne doit pas être null
     */
    @Column(nullable = false)
    private String password;

    /**
     * Permet d'autoriser l'accès ou non à l'application web
     * Valeur true, donc autorisé, par défaut
     */
    private Boolean access = true;

    /**
     * Date de création de l'utilisateur qui s'enregistre automatiquement
     * Elle ne peut pas être modifiée après la création
     */
    @Column(updatable = false, name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    /**
     * Date de modification de l'utilisateur qui s'enregistre automatiquement
     */
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}