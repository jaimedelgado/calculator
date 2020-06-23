package com.sanitas.calculator.configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Swagger config test
 */
public class Swagger2ConfigTest {

    /**
     * Api docket test
     */
    @Test
    public void apiTest() {
        Assertions.assertNotNull(Swagger2Config.api());
    }

}