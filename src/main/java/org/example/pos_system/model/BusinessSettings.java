package org.example.pos_system.model;

import jakarta.persistence.*;

@Entity
public class BusinessSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String currency;
    private double defaultTaxRate;

    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private Business business;
}
