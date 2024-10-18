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

    public Product() {
    }

    // Constructor with parameters
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name; // Ensure this getter method exists
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price; // Example getter method
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
