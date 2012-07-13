/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.ui.action;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import com.moser.dm2.ui.DMFrame;


/**
 * AboutAction
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class AboutAction extends DMAction {

    private static final long serialVersionUID = 1L;

    private static final String TITLE = "About";
    
    private static final String ABOUT = "Drink Master 2.0 - Copyright 2007-2012 Nicolas Moser";

    private static final String ACTION_ID = "About";
    
    /**
     * Creates a new {@link AboutAction} instance.
     */
    public AboutAction() {
        super(ACTION_ID);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(DMFrame.getInstance(), ABOUT, TITLE, JOptionPane.INFORMATION_MESSAGE);
    }

}
