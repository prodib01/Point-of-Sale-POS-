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

    public BusinessSettings() {

    }

    public BusinessSettings(String currency, Double defaultTaxRate) {
        this.currency = currency;
        this.defaultTaxRate = defaultTaxRate;
    }

    //Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getDefaultTaxRate() {
        return defaultTaxRate;
    }

    public void setDefaultTaxRate(Double defaultTaxRate) {
        this.defaultTaxRate = defaultTaxRate;
    }

}
