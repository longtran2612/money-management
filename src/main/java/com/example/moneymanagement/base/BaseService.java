package com.example.moneymanagement.base;

import com.example.moneymanagement.service.SequenceValueService;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

/**
 * 9:42 PM 18-Feb-23
 * Long Tran
 */
@Component
public class BaseService extends BaseObjectLoggable{

    @Autowired
    protected SequenceValueService sequenceValueService;

    @Autowired
    protected Validator validator;

    protected void validate(Object object) {
       var violations = validator.validate(object);
       logger.info("Violations: {}", violations);
       if (!violations.isEmpty()) {
           throw new RuntimeException(violations.stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(", ")));
       }

    }
}
