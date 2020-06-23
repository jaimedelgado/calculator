package com.sanitas.calculator.controller.request.get;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum Operator {
    ADD("+", "Arithmetic operation for adding two numbers");
    private String representation;
    private String description;
}
