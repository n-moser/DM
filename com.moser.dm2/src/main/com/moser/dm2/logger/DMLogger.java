/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.logger;

/**
 * DMLogger
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public interface DMLogger {

    void error(String... message);

    void warning(String... message);

    void info(String... message);

    boolean isDebugEnabled();
}
