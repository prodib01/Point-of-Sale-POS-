package org.example.pos_system.service;

import org.example.pos_system.model.Product;
import org.example.pos_system.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // Create a new product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get a product by ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // Update a product
    public Product updateProduct(Long id, Product productDetails) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        // Update fields as necessary
        product.setName(productDetails.getName()); // Ensure this method exists
        product.setPrice(productDetails.getPrice());
        // Update other fields as needed

        return productRepository.save(product);
    }


    // Delete a product
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
