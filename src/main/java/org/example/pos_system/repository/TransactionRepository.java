package org.example.pos_system.repository;

import org.example.pos_system.model.Business;
import org.example.pos_system.model.Product;
import org.example.pos_system.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByBusiness(Business business);
}
