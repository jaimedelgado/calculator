package com.sanitas.calculator.exception;


import org.springframework.http.HttpStatus;

/**
 * The type Main exception. TODO: ErrorHandler foy beautify output
 *
 * @author paradigma
 */
public class MainException extends Exception {

    /**
     * Instantiates a new Main exception.
     *
     * @param message the message
     */
    public MainException(String message) {
        super(message);
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public HttpStatus getStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
