package com.sanitas.calculator.model;

import lombok.Getter;

@Getter
public abstract class BinaryOperation implements Operation {

    double operand1;
    double operand2;
}
