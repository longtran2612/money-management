package com.example.moneymanagement.domain;

import com.example.moneymanagement.base.BaseModel;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * 3:15 PM 05-Mar-23
 * Long Tran
 */
@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transactions")
public class Transaction extends BaseModel {

    private String name;
    private String description;
    private String status;
    private String userId;
    private String type;
    private BigDecimal amount;
    private String necessaryLevel;



}
