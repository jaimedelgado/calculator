package com.sanitas.calculator.service;

import com.sanitas.calculator.model.Operation;
import org.springframework.stereotype.Component;

@Component
public class OperationsServiceImpl implements OperationsService {

    @Override
    public double execute(Operation operation) {
        return operation.execute();
    }
}
