package com.sanitas.calculator.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtractionTest {

    public static Operation operation;

    @Test
    public void executeTest() {
        operation = new Subtraction(5, 2);
        Assertions.assertEquals(operation.execute(), 3);
    }
}
