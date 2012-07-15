/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.turn;

import com.moser.dm2.model.drink.DrinkInGame;
import com.moser.dm2.model.player.PlayerInGame;

/**
 * BasicTurn
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class BasicTurn extends Turn {

    private static final long serialVersionUID = 1L;

    private DrinkInGame drink;

    private PlayerInGame player;

    /**
     * Creates a new {@link BasicTurn} instance.
     * 
     * @param drink
     *            the current drink
     * @param player
     *            the current player
     * @param round
     *            the current round
     */
    public BasicTurn(DrinkInGame drink, PlayerInGame player, Integer round) {
        super(TurnType.BASIC, round);

        if (drink == null) {
            throw new IllegalArgumentException("Cannot create BasicTurn for drink 'null'.");
        }
        if (player == null) {
            throw new IllegalArgumentException("Cannot create BasicTurn for player 'null'.");
        }
        this.drink = drink;
        this.player = player;
    }

    /**
     * Getter for the player.
     * 
     * @return Returns the player.
     */
    public PlayerInGame getPlayer() {
        return this.player;
    }

    /**
     * Getter for the drink.
     * 
     * @return Returns the drink.
     */
    public DrinkInGame getDrink() {
        return this.drink;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.player);
        result.append(" -> ");
        result.append(this.drink);
        return result.toString();
    }
}
