package org.example.pos_system.repository;

import org.example.pos_system.model.User; // Fixed import
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
