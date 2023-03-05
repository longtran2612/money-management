package com.example.moneymanagement.repository;

import com.example.moneymanagement.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 3:40 PM 05-Mar-23
 * Long Tran
 */
public interface TransactionRepository extends JpaRepository<Transaction,String> {

    List<Transaction> getTransactionByUserId(String userId);

}
