/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.ui.action;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.moser.dm2.logger.DMLogger;
import com.moser.dm2.logger.DMLoggingFactory;
import com.moser.dm2.ui.DMFrame;

/**
 * ExitAction
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class ExitAction extends DMAction implements Action {

    private static final long serialVersionUID = 1L;

    private static final String ACTION_ID = "Exit";

    private static final String ICON = "/exit.png";

    private DMLogger logger = DMLoggingFactory.getLogger(ExitAction.class);

    /**
     * Creates a new {@link ExitAction} instance.
     */
    public ExitAction() {
        super(ACTION_ID, new ImageIcon(ICON));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int result = JOptionPane.showConfirmDialog(DMFrame.getInstance(), "Do you really want to exit?",
                "Exit Drink Master", JOptionPane.OK_CANCEL_OPTION);

        switch (result) {

        case JOptionPane.OK_OPTION: {
            this.logger.info("Exit Drink Master");
            System.exit(0);
            break;
        }

        case JOptionPane.CANCEL_OPTION: {
            this.logger.info("Cancel Exit");
            break;
        }

        }

    }

}
