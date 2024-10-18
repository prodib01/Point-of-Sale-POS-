package org.example.pos_system.repository;

import org.example.pos_system.model.SaleItem;
import org.example.pos_system.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleItemRepository extends JpaRepository<SaleItem, Long> {
}
