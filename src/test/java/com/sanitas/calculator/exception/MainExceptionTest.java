package com.sanitas.calculator.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

public class MainExceptionTest {

    @Test
    public void createMainExceptionTest(){
        Assertions.assertEquals(new MainException("message").getStatus(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
