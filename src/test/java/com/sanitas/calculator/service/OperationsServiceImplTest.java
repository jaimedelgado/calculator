package com.sanitas.calculator.service;

import com.sanitas.calculator.model.Addition;
import com.sanitas.calculator.model.Subtraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Service layer test
 */
public class OperationsServiceImplTest {

    private static OperationsService operationsService;

    @BeforeAll
    public static void setup() {
        operationsService = new OperationsServiceImpl();
    }

    /**
     * Addition service test
     */
    @Test
    public void operationsServiceExecuteAdditionTest() {
        Assertions.assertEquals(operationsService.execute(new Addition(1, 2)), 3);
    }

    /**
     * Subtraction service test
     */
    @Test
    public void operationsServiceExecuteSubtractionTest() {
        Assertions.assertEquals(operationsService.execute(new Subtraction(5, 2)), 3);
    }
}
