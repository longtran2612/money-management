package com.example.moneymanagement.domain;

/**
 * 9:38 PM 18-Feb-23
 * Long Tran
 */

import com.example.moneymanagement.base.BaseModel;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;
@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sequence_value")
public class SequenceValue extends BaseModel {

    private int seqId;


}
