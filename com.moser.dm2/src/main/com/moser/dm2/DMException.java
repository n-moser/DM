/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2;

/**
 * DMException
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class DMException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new {@link DMException} instance.
     * 
     * @param message
     *            error message
     */
    public DMException(String message) {
        super(message);
    }

    /**
     * Creates a new {@link DMException} instance.
     * 
     * @param message
     *            error message
     * @param cause
     *            the error cause
     */
    public DMException(String message, Exception cause) {
        super(message, cause);
    }

}
