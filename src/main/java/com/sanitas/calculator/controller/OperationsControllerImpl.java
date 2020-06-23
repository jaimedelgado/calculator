package com.sanitas.calculator.controller;

import com.sanitas.calculator.controller.mapper.OperationsMapper;
import com.sanitas.calculator.controller.request.get.Operator;
import com.sanitas.calculator.controller.response.ResponseBase;
import com.sanitas.calculator.controller.response.get.OperationResult;
import com.sanitas.calculator.model.Operation;
import com.sanitas.calculator.service.OperationsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Calculator API", tags = {"Operations"})
public class OperationsControllerImpl implements OperationsController {

    @Autowired
    private OperationsMapper operationsMapper;
    @Autowired
    private OperationsService operationsService;

    @Override
    public ResponseEntity<ResponseBase<OperationResult>> getOperationResult(double operand1,
        Operator operator, double operand2) {
        Operation operation = operationsMapper.toDTO(operand1, operator, operand2);
        double result = operationsService.execute(operation);
        return new ResponseEntity<>(new ResponseBase<>(new OperationResult(result)), HttpStatus.OK);
    }
}
