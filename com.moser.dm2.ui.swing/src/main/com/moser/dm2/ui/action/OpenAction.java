/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.ui.action;

import java.awt.event.ActionEvent;

/**
 * SaveAction
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class OpenAction extends DMAction {

    private static final long serialVersionUID = 1L;

    private static final String ACTION_ID = "Open";

    /**
     * Creates a new {@link OpenAction} instance.
     */
    public OpenAction() {
        super(ACTION_ID);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("OpenAction is not implemented yet.");
    }

}