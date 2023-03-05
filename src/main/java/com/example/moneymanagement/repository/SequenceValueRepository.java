package com.example.moneymanagement.repository;

import com.example.moneymanagement.domain.SequenceValue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 3:42 PM 05-Mar-23
 * Long Tran
 */
public interface SequenceValueRepository extends JpaRepository<SequenceValue,String> {
}
