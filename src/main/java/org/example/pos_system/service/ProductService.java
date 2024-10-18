package org.example.pos_system.service;

import org.example.pos_system.model.Product;
import org.example.pos_system.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductsByBusiness(Long businessId) {
        // Logic to fetch products by business
        return List.of(); // Update this logic accordingly
    }

    // Method to get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll(); // Get all products
    }

    // Method to save a new product
    public Product saveProduct(Product product) {
        return productRepository.save(product); // Save the product
    }
}
