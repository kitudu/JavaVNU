package vn.edu.vnu.java.prac01less23.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false
    private String password;

    // Getters and setters

}

