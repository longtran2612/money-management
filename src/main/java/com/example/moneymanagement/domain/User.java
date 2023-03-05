package com.example.moneymanagement.domain;

import com.example.moneymanagement.base.BaseModel;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * 3:20 PM 05-Mar-23
 * Long Tran
 */
@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User extends BaseModel {

    private String name;
    private LocalDate birthday;
    private String email;
    private String username;
    private String password;

    private String avatar;
}
