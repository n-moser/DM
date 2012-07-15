/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.persistence.session;

/**
 * SessionFactory
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class SessionFactory {

    private Session session;

    /**
     * Getter for the session.
     * 
     * @return Returns the session.
     */
    public Session getSession() {
        if (this.session == null) {
            this.session = new SimpleSession();
        }
        return this.session;
    }

}
