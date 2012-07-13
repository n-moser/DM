/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service;

import com.moser.dm2.DMException;

/**
 * ServiceException
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class ServiceException extends DMException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new {@link ServiceException} instance.
     * 
     * @param message
     *            error message
     */
    public ServiceException(String message) {
        super(message);
    }

    /**
     * Creates a new {@link ServiceException} instance.
     * 
     * @param message
     *            error message
     * @param cause
     *            the error cause
     */
    public ServiceException(String message, Exception cause) {
        super(message, cause);
    }
}
