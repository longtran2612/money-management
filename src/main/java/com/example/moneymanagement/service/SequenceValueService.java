package com.example.moneymanagement.service;

import com.example.moneymanagement.domain.SequenceValue;
import com.example.moneymanagement.repository.SequenceValueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * 3:43 PM 05-Mar-23
 * Long Tran
 */
@Service
@RequiredArgsConstructor
public class SequenceValueService {

    private final SequenceValueRepository sequenceValueRepository;

    public String getSequence(Class forClass) {
        String sequenceName = forClass.getName();
        SequenceValue sequenceValueItem = sequenceValueRepository.findById(sequenceName).orElse(null);
        if(sequenceValueItem == null) {
            sequenceValueItem = new SequenceValue();
            sequenceValueItem.setSeqId(1000);
            sequenceValueItem.setCreatedDate(LocalDate.now());
        }else{
            int sequenceId = sequenceValueItem.getSeqId() + 1;
            sequenceValueItem.setSeqId(sequenceId);
            sequenceValueItem.setCreatedDate(LocalDate.now());
        }
        return String.valueOf(sequenceValueRepository.save(sequenceValueItem).getSeqId());
    }

}
