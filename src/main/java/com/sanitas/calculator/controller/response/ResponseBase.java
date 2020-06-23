package com.sanitas.calculator.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@ApiModel
public class ResponseBase<T> {
    @ApiModelProperty
    private final T data;
}
