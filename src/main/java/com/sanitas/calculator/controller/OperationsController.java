package com.sanitas.calculator.controller;

import com.sanitas.calculator.controller.request.get.Operator;
import com.sanitas.calculator.controller.response.ResponseBase;
import com.sanitas.calculator.controller.response.get.OperationResult;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Operations controller
 */
public interface OperationsController {

    /**
     * Get operation result
     *
     * @return operation result
     */
    @ApiOperation(value = "Get operation result")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = ControllerConstants.API_RESPONSE_200),
        @ApiResponse(code = 500, message = ControllerConstants.API_RESPONSE_500)
    })
    @RequestMapping(value = "/operations", method = RequestMethod.GET, produces = {
        MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<ResponseBase<OperationResult>> getOperationResult(
        @RequestParam("operand1") double operand1,
        @RequestParam("operator") Operator operator,
        @RequestParam("operand2") double operand2);

}
