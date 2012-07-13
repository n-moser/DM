/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.ui.action;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;

/**
 * DMAction
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public abstract class DMAction extends AbstractAction implements Action {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new {@link DMAction} instance.
     * 
     * @param actionId
     *            the action ID
     */
    public DMAction(String actionId) {
        super(actionId);
    }

    /**
     * Creates a new {@link DMAction} instance.
     * 
     * @param actionId
     *            the action ID
     * @param icon
     *            the action icon
     */
    public DMAction(String actionId, Icon icon) {
        super(actionId, icon);
    }
}
