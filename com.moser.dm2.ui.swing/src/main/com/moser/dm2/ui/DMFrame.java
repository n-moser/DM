/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.ui;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import com.moser.dm2.logger.DMLogger;
import com.moser.dm2.logger.DMLoggingFactory;

/**
 * DMFrame
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class DMFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    private static final String TITLE = "Drink Master 2.0";

    private static final DMLogger logger = DMLoggingFactory.getLogger(DMFrame.class);
    
    private JMenuBar menuBar;

    private static DMFrame instance;

    /**
     * Creates a new {@link DMFrame} instance.
     */
    private DMFrame() {
        super(TITLE);

        super.setSize(800, 600);
        super.setLocation(400, 100);

        this.menuBar = new DMMenu();
        super.setJMenuBar(this.menuBar);
    }

    /**
     * Getter for the instance.
     * 
     * @return Returns the instance.
     */
    public static synchronized DMFrame getInstance() {
        if (instance == null) {
            logger.info("Creating new DMFrame.");
            instance = new DMFrame();
        }
        return instance;
    }

    /**
     * Starts the Application.
     * 
     * @param args
     *            application arguments
     */
    public static void main(String[] args) {

        try {
            DMFrame frame = DMFrame.getInstance();
            frame.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
