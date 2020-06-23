package com.sanitas.calculator.configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Configuration to Swagger Test
 */
public class Swagger2ConfigTest {

    /**
     * Api docket.
     */
    @Test
    public void apiTest() {
        Assertions.assertNotNull(Swagger2Config.api());
    }

}