package com.example.moneymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class MoneyManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoneyManagementApplication.class, args);
    }

}
