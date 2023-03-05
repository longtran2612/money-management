package com.example.moneymanagement.service;

import com.example.moneymanagement.base.BaseService;
import com.example.moneymanagement.domain.Transaction;
import com.example.moneymanagement.dto.request.transaction.CreateTransactionRequest;
import com.example.moneymanagement.repository.TransactionRepository;
import com.example.moneymanagement.utils.MappingUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 3:46 PM 05-Mar-23
 * Long Tran
 */
@Service
@RequiredArgsConstructor
public class TransactionService extends BaseService {

    private final TransactionRepository transactionRepository;

    public Transaction create(CreateTransactionRequest request){
        var transaction = MappingUtils.mapObject(request, Transaction.class);
        transaction.setId(sequenceValueService.getSequence(Transaction.class));
        return transactionRepository.save(transaction);
    }

    public Transaction getTransactionById(String id){
        return transactionRepository.findById(id).orElse(null);
    }

    public List<Transaction> getTransactionByUserId(String userId){
        return transactionRepository.getTransactionByUserId(userId);
    }

    public void delete(String id){
        transactionRepository.deleteById(id);
    }
}
