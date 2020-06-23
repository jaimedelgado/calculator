package com.sanitas.calculator.controller.request.get;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Available operators in the calculator
 */
@AllArgsConstructor
@NoArgsConstructor
public enum Operator {
    ADD("+", "Arithmetic operation for adding two numbers"),
    SUB("-", "Arithmetic operation for substrating two numbers");

    private String representation;
    private String description;
}
