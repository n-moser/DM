/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.turn;

import com.moser.dm2.model.Datatype;

/**
 * Turn
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public abstract class Turn extends Datatype {

    private static final long serialVersionUID = 1L;

    private final TurnType type;

    private final Integer round;

    /**
     * Creates a new {@link Turn} instance.
     * 
     * @param type
     *            the turn type
     */
    public Turn(TurnType type, Integer round) {
        if (type == null) {
            throw new IllegalArgumentException("Cannot create Turn for type 'null'.");
        }
        if (round == null) {
            throw new IllegalArgumentException("Cannot create Turn for round 'null'.");
        }
        this.type = type;
        this.round = round;
    }

    /**
     * Getter for the type.
     * 
     * @return Returns the type.
     */
    public TurnType getType() {
        return this.type;
    }

    /**
     * Getter for the round.
     * 
     * @return Returns the round.
     */
    public Integer getRound() {
        return this.round;
    }
}
