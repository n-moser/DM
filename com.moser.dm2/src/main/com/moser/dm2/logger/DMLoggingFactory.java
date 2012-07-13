/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.logger;


/**
 * DMLoggingFactory
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class DMLoggingFactory {

    public static DMLogger getLogger(Class<?> clazz) {
        return new SimpleLogger(clazz);
    }
    
}
