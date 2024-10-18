package org.example.pos_system.repository;

import org.example.pos_system.model.Business;
import org.example.pos_system.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusinessRepository extends JpaRepository<Business, Long> {

}