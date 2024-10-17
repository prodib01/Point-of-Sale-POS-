package org.example.pos_system.model;

import jakarta.persistence.Entity; // Change this to `jakarta.persistence`
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private int stock;
    private String category;

    // Getters and Setters
    // ...
}
