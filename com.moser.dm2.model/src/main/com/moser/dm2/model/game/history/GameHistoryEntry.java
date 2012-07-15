/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.game.history;

import java.util.Date;

import com.moser.dm2.model.turn.Turn;

/**
 * GameHistoryEntry
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class GameHistoryEntry {

    private Turn turn;

    private Date creationDate;

    /**
     * Creates a new {@link GameHistoryEntry} instance.
     * 
     * @param turn
     *            the current turn
     * @param date
     *            creation date
     */
    public GameHistoryEntry(Turn turn, Date date) {
        if (turn == null) {
            throw new IllegalArgumentException("Cannot create History Entry for Turn 'null'.");
        }
        if (date == null) {
            throw new IllegalArgumentException("Cannot create History Entry for Date 'null'.");
        }
        
        this.turn = turn;
        this.creationDate = date;
    }

    /**
     * Getter for the turn.
     * 
     * @return Returns the turn.
     */
    public Turn getTurn() {
        return this.turn;
    }

    /**
     * Getter for the creationDate.
     * 
     * @return Returns the creationDate.
     */
    public Date getCreationDate() {
        return this.creationDate;
    }
}
