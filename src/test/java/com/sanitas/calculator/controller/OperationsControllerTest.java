package com.sanitas.calculator.controller;

import com.sanitas.calculator.controller.request.get.Operator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

/**
 * Configuration to Swagger Test
 */
public class OperationsControllerTest {
    private static OperationsController operationsController;

    @BeforeAll
    public static void setUp(){
        operationsController = new OperationsControllerImpl();
    }
    /**
     * Api docket.
     *
     */
    @Test
    public void getOperationResult(){
        Assertions.assertEquals(operationsController.getOperationResult(2, Operator.ADD, 3).getStatusCode(), HttpStatus.OK);
        Assertions.assertEquals(operationsController.getOperationResult(2, Operator.ADD, 3).getBody().getData().getResult(), 5);
    }

}