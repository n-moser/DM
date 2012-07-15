/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.persistence.session;

import com.moser.dm2.model.Datatype;
import com.moser.dm2.model.game.Game;

/**
 * Session
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public abstract class Session extends Datatype {

    private static final long serialVersionUID = 1L;

    private Game game;

    /**
     * Creates a new {@link Session} instance.
     */
    protected Session() {
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
