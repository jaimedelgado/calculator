package com.sanitas.calculator.model;

public class Addition extends BinaryOperation {

    public Addition(double pOperand1, double pOperand2) {
        this.operand1 = pOperand1;
        this.operand2 = pOperand2;
    }

    @Override
    public double execute() {
        return operand1 + operand2;
    }
}
