package com.sanitas.calculator.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.sanitas.calculator.controller.mapper.OperationsMapper;
import com.sanitas.calculator.controller.request.get.Operator;
import com.sanitas.calculator.log.Logger;
import com.sanitas.calculator.log.LoggerImpl;
import com.sanitas.calculator.model.Addition;
import com.sanitas.calculator.model.Operation;
import com.sanitas.calculator.model.Subtraction;
import com.sanitas.calculator.service.OperationsService;
import com.sanitas.calculator.service.OperationsServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

/**
 * Configuration to Swagger Test
 */
@SpringBootTest
public class OperationsControllerTest {

    @Autowired
    @InjectMocks
    private static OperationsControllerImpl operationsController;
    @Mock
    private final OperationsService operationsService = mock(OperationsServiceImpl.class);
    @Mock
    private final OperationsMapper operationsMapper = mock(OperationsMapper.class);
    @Mock
    private final Logger logger = mock(LoggerImpl.class);

    @Test
    public void getOperationResultWithAddition() {
        Operation operation = new Addition(2, 3);
        when(operationsMapper.toDTO(anyDouble(), any(Operator.class), anyDouble()))
            .thenReturn(operation);
        when(operationsService.execute(operation)).thenReturn(5d);
        Assertions.assertEquals(
            operationsController.getOperationResult(2, Operator.ADD, 3).getStatusCode(),
            HttpStatus.OK);
        Assertions.assertEquals(
            operationsController.getOperationResult(2, Operator.ADD, 3).getBody().getData()
                .getResult(), 5);
    }

    @Test
    public void getOperationResultWithSubtraction() {
        Operation operation = new Subtraction(5, 3);
        when(operationsMapper.toDTO(anyDouble(), any(Operator.class), anyDouble()))
            .thenReturn(operation);
        when(operationsService.execute(operation)).thenReturn(2d);
        Assertions.assertEquals(
            operationsController.getOperationResult(2, Operator.ADD, 3).getStatusCode(),
            HttpStatus.OK);
        Assertions.assertEquals(
            operationsController.getOperationResult(2, Operator.ADD, 3).getBody().getData()
                .getResult(), 2);
    }

}