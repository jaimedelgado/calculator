package com.sanitas.calculator.controller;

import com.sanitas.calculator.controller.request.get.Operator;
import com.sanitas.calculator.controller.response.ResponseBase;
import com.sanitas.calculator.controller.response.get.OperationResult;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Calculator API", tags = {"Operations"})
public class OperationsControllerImpl implements OperationsController {

    @Override
    public ResponseEntity<ResponseBase<OperationResult>> getOperationResult(double operand1, Operator operator, double operand2) {
        //TODO: include service
        return new ResponseEntity<>(new ResponseBase<>(new OperationResult(5)), HttpStatus.OK);
    }
}
