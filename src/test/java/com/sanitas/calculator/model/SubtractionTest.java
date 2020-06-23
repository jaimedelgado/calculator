package com.sanitas.calculator.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test subtraction model
 */
public class SubtractionTest {

    public static Operation operation;

    /**
     * Test subtraction execution
     */
    @Test
    public void executeTest() {
        operation = new Subtraction(5, 2);
        Assertions.assertEquals(operation.execute(), 3);
    }
}
