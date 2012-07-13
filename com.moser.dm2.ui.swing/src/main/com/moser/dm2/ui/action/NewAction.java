/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.ui.action;

import java.awt.event.ActionEvent;

import com.moser.dm2.logger.DMLogger;
import com.moser.dm2.logger.DMLoggingFactory;


/**
 * NewAction
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class NewAction extends DMAction {
    
    private static final long serialVersionUID = 1L;
    
    private DMLogger logger = DMLoggingFactory.getLogger(NewAction.class);

    private static final String ACTION_ID = "New";

    /**
     * Creates a new {@link NewAction} instance.
     */
    public NewAction() {
        super(ACTION_ID);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.logger.info("New");
    }

}
