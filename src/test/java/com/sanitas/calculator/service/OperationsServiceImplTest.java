package com.sanitas.calculator.service;

import com.sanitas.calculator.model.Addition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OperationsServiceImplTest {

    private static OperationsService operationsService;

    @BeforeAll
    public static void setup() {
        operationsService = new OperationsServiceImpl();
    }

    @Test
    public void operationsServiceExecuteTest() {
        Assertions.assertEquals(operationsService.execute(new Addition(1, 2)), 3);
    }
}
