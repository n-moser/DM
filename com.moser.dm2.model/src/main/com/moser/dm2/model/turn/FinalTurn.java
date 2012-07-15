/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.turn;

/**
 * FinalTurn
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class FinalTurn extends Turn {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new {@link FinalTurn} instance.
     * 
     * @param round
     *            the last round
     */
    public FinalTurn(Integer round) {
        super(TurnType.FINAL, round);
    }

    @Override
    public String toString() {
        return "Final Turn";
    }
}
