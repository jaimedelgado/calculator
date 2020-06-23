package com.sanitas.calculator.model;

public class Subtraction extends BinaryOperation {

    public Subtraction(double pOperand1, double pOperand2) {
        this.operand1 = pOperand1;
        this.operand2 = pOperand2;
    }

    @Override
    public double execute() {
        return operand1 - operand2;
    }
}
