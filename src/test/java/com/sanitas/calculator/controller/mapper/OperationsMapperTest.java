package com.sanitas.calculator.controller.mapper;

import com.sanitas.calculator.controller.request.get.Operator;
import com.sanitas.calculator.model.Addition;
import com.sanitas.calculator.model.Operation;
import com.sanitas.calculator.model.Subtraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Mapper test
 */
public class OperationsMapperTest {

    private static OperationsMapper operationsMapper;

    @BeforeAll
    public static void setUp() {
        operationsMapper = new OperationsMapper();
    }

    /**
     * Test a add operation to dto mapping
     */
    @Test
    public void additionOperationDTOTest() {
        double operand2 = 2;
        double operand1 = 1;
        Operation operation = operationsMapper.toDTO(operand1, Operator.ADD, operand2);
        Assertions.assertTrue(operation instanceof Addition);
        Assertions.assertEquals(((Addition) operation).getOperand1(), operand1);
        Assertions.assertEquals(((Addition) operation).getOperand2(), operand2);
    }

    /**
     * Test a sub operation to dto mapping
     */
    @Test
    public void subtractionOperationDTOTest() {
        double operand2 = 2;
        double operand1 = 1;
        Operation operation = operationsMapper.toDTO(operand1, Operator.SUB, operand2);
        Assertions.assertTrue(operation instanceof Subtraction);
        Assertions.assertEquals(((Subtraction) operation).getOperand1(), operand1);
        Assertions.assertEquals(((Subtraction) operation).getOperand2(), operand2);
    }
}
