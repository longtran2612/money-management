package com.example.moneymanagement.dto.request.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * 3:51 PM 05-Mar-23
 * Long Tran
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserRequest {
    private String name;
    private LocalDate birthday;
    private String email;
    private String username;
    private String password;
    private String avatar;
    private String createdBy;
}
