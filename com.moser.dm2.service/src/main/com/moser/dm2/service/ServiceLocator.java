/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service;

/**
 * ServiceLocator
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public abstract class ServiceLocator<S extends Service> {

    /**
     * Retrieve the given Service.
     * 
     * @return the service implementation
     */
    public abstract S getService();

}
