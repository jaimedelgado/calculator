package com.sanitas.calculator.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    public static Operation operation;

    @Test
    public void executeTest() {
        operation = new Addition(1, 2);
        Assertions.assertEquals(operation.execute(), 3);
    }
}
