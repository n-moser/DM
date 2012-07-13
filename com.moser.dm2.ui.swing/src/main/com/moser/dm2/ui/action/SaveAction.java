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
public class SaveAction extends DMAction {

    private static final long serialVersionUID = 1L;

    private static final String ACTION_ID = "Save";

    /**
     * Creates a new {@link SaveAction} instance.
     */
    public SaveAction() {
        super(ACTION_ID);

        super.setEnabled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("SaveAction is not implemented yet.");
    }

}