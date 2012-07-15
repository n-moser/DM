/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.game;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.moser.dm2.model.game.history.GameHistoryEntry;
import com.moser.dm2.model.turn.Turn;

/**
 * GameHistory
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class GameHistory {

    private List<GameHistoryEntry> entries;

    /**
     * Creates a new {@link GameHistory} instance.
     */
    public GameHistory() {
        this.entries = new ArrayList<GameHistoryEntry>();
    }

    /**
     * Add the given entries to the history.
     * 
     * @param drink
     *            the current drink
     * @param player
     *            the current player
     */
    public void add(Turn turn) {
        this.entries.add(new GameHistoryEntry(turn, new Date()));
    }

    /**
     * Retrieves the entry of the given round.
     * 
     * @param round
     *            the round (starting at 1)
     * @return the given entry
     */
    public GameHistoryEntry get(Integer round) {
        if (round == null) {
            return null;
        }
        if (round < 1) {
            return null;
        }
        if (round > this.entries.size()) {
            return null;
        }

        return this.entries.get(round - 1);
    }
}
