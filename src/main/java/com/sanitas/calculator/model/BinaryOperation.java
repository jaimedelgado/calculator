package com.sanitas.calculator.model;

import lombok.Getter;

/**
 * Bynary operation
 */
@Getter
public abstract class BinaryOperation implements Operation {

    double operand1;
    double operand2;
}
