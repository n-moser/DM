/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.ui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import com.moser.dm2.ui.action.AboutAction;
import com.moser.dm2.ui.action.ExitAction;
import com.moser.dm2.ui.action.NewAction;
import com.moser.dm2.ui.action.OpenAction;
import com.moser.dm2.ui.action.SaveAction;

/**
 * DMMenu
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class DMMenu extends JMenuBar {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new {@link DMMenu} instance.
     */
    public DMMenu() {

        this.init();
    }

    /**
     * Initialize the Menu Bar.
     */
    private void init() {
        this.createFileMenu();
        this.createEditMenu();
        this.createHelpMenu();
    }
    
    private void createFileMenu() {
        JMenu fileMenu = new JMenu("File");

        fileMenu.add(new NewAction());
        fileMenu.addSeparator();
        fileMenu.add(new OpenAction());
        fileMenu.add(new SaveAction());
        fileMenu.addSeparator();
        fileMenu.add(new ExitAction());
        
        this.add(fileMenu);
    }

    private void createEditMenu() {
        JMenu editMenu = new JMenu("Edit");
        this.add(editMenu);
    }

    private void createHelpMenu() {
        JMenu helpMenu = new JMenu("Help");
        
        helpMenu.add(new AboutAction());
        
        this.add(helpMenu);
    }
}
