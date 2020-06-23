package com.sanitas.calculator.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

/**
 * Main exception test
 */
public class MainExceptionTest {

    /**
     * Create main exception test
     */
    @Test
    public void createMainExceptionTest() {
        Assertions.assertEquals(new MainException("message").getStatus(),
            HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
