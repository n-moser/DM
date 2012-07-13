/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleLogger
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
class SimpleLogger implements DMLogger {

    private static final boolean DEBUG = true;

    private final Class<?> clazz;

    /**
     * Creates a new {@link SimpleLogger} instance.
     * 
     * @param clazz
     *            the logging class
     */
    public SimpleLogger(Class<?> clazz) {
        this.clazz = clazz;
    }

    @Override
    public void error(String... message) {
        print("ERROR", concatenate(message));
    }

    @Override
    public void warning(String... message) {
        this.print("WARN", message);
    }

    @Override
    public void info(String... message) {
        print("INFO", message);
    }

    @Override
    public boolean isDebugEnabled() {
        return DEBUG;
    }

    /**
     * Print the message to console.
     * 
     * @param message
     *            the message to print
     */
    private void print(String level, String... message) {

        if (this.isDebugEnabled()) {
            DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss,SSS");

            StringBuilder result = new StringBuilder();
            result.append(dateFormat.format(new Date()));
            result.append(" [");
            result.append(this.clazz.getSimpleName());
            result.append("] ");

            result.append(level);
            result.append(" ");
            result.append(concatenate(message));

            if (level.equals("ERROR")) {
                System.err.println(result.toString());
            } else {
                System.out.println(result.toString());
            }
        }
    }

    private String concatenate(String... messages) {
        StringBuilder result = new StringBuilder();

        for (String message : messages) {
            result.append(String.valueOf(message));
        }

        return result.toString();
    }

}
