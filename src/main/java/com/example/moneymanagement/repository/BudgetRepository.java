package com.example.moneymanagement.repository;

import com.example.moneymanagement.domain.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 3:41 PM 05-Mar-23
 * Long Tran
 */

public interface BudgetRepository extends JpaRepository<Budget,String> {
}
