package com.sanitas.calculator.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {
    public static Addition addition;
    @Test
    public void executeTest(){
        addition = new Addition(1,2);
        Assertions.assertEquals(addition.execute(), 3);
    }
}
