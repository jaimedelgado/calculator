package com.sanitas.calculator.controller.mapper;

import com.sanitas.calculator.controller.request.get.Operator;
import com.sanitas.calculator.model.Addition;
import com.sanitas.calculator.model.Operation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OperationsMapperTest {

    private static OperationsMapper operationsMapper;

    @BeforeAll
    public static void setUp() {
        operationsMapper = new OperationsMapper();
    }

    @Test
    public void restToDTOTest() {
        double operand2 = 2;
        double operand1 = 1;
        Operation operation = operationsMapper.toDTO(operand1, Operator.ADD, operand2);
        Assertions.assertTrue(operation instanceof Addition);
        Assertions.assertEquals(((Addition) operation).getOperand1(), operand1);
        Assertions.assertEquals(((Addition) operation).getOperand2(), operand2);
    }
}
