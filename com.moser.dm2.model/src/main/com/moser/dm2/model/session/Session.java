/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.session;

import com.moser.dm2.model.game.Game;

/**
 * Session
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class Session {
    
    private Game game;
    
    /**
     * Singleton instance.
     */
    private static Session instance = new Session();

    /**
     * Private constructor.
     */
    private Session() {
    }

    /**
     * Singleton access.
     * 
     * @return the Session instance.
     */
    public static Session getInstance() {
        return instance;
    }

    /**
     * Getter for the game.
     * 
     * @return Returns the game.
     */
    public Game getGame() {
        return this.game;
    }

    /**
     * Setter for the game.
     * 
     * @param game
     *            The game to set.
     */
    public void setGame(Game game) {
        this.game = game;
    }

}
