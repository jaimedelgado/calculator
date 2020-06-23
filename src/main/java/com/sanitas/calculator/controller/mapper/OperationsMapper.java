package com.sanitas.calculator.controller.mapper;

import com.sanitas.calculator.controller.request.get.Operator;
import com.sanitas.calculator.model.Addition;
import com.sanitas.calculator.model.Operation;
import com.sanitas.calculator.model.Subtraction;
import org.springframework.stereotype.Component;

/**
 * Controller mapper. Map rest to dto layers.
 */
@Component
public class OperationsMapper {

    public Operation toDTO(double operand1, Operator operator, double operand2) {
        return operator.equals(Operator.ADD) ? new Addition(operand1, operand2)
            : operator.equals(Operator.SUB) ? new Subtraction(operand1, operand2) : null;
    }
}
