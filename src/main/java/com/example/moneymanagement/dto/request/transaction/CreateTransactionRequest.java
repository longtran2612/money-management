package com.example.moneymanagement.dto.request.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.math.BigDecimal;

/**
 * 3:53 PM 05-Mar-23
 * Long Tran
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTransactionRequest {
    private String name;
    private String description;
    private String status;
    private String userId;
    private String type;
    private BigDecimal amount;
    private String necessaryLevel;

    private String createdBy;
}
