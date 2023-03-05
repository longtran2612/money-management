package com.example.moneymanagement.repository;

import com.example.moneymanagement.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * 3:39 PM 05-Mar-23
 * Long Tran
 */
public interface UserRepository extends JpaRepository<User,String> {
    public Optional<User> findByUsername(String username);
}
