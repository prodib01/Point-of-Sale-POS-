package org.example.pos_system.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private int stock;
    private double taxRate;

    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private Business business;

    // Getters and Setters
    // ...
}
