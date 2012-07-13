/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.game;

import java.util.ArrayList;
import java.util.List;

import com.moser.dm2.model.Datatype;
import com.moser.dm2.model.drink.DrinkInGame;
import com.moser.dm2.model.player.PlayerInGame;

/**
 * Game
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class Game extends Datatype {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer rounds;

    private Integer currentRound;

    private List<DrinkInGame> drinks;

    private List<PlayerInGame> players;

    /**
     * Creates a new {@link Game} instance.
     */
    public Game() {

    }

    /**
     * Getter for the name.
     * 
     * @return Returns the name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for the name.
     * 
     * @param name
     *            The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the rounds.
     * 
     * @return Returns the rounds.
     */
    public Integer getRounds() {
        return this.rounds;
    }

    /**
     * Setter for the rounds.
     * 
     * @param rounds
     *            The rounds to set.
     */
    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    /**
     * Getter for the currentRound.
     * 
     * @return Returns the currentRound.
     */
    public Integer getCurrentRound() {
        return this.currentRound;
    }

    /**
     * Setter for the currentRound.
     * 
     * @param currentRound
     *            The currentRound to set.
     */
    public void setCurrentRound(Integer currentRound) {
        this.currentRound = currentRound;
    }

    /**
     * Getter for the drinks.
     * 
     * @return Returns the drinks.
     */
    public List<DrinkInGame> getDrinks() {
        if (this.drinks == null) {
            this.drinks = new ArrayList<DrinkInGame>();
        }
        return this.drinks;
    }

    /**
     * Getter for the players.
     * 
     * @return Returns the players.
     */
    public List<PlayerInGame> getPlayers() {
        if (this.players == null) {
            this.players = new ArrayList<PlayerInGame>();
        }
        return this.players;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((this.currentRound == null) ? 0 : this.currentRound.hashCode());
        result = prime * result + ((this.drinks == null) ? 0 : this.drinks.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.players == null) ? 0 : this.players.hashCode());
        result = prime * result + ((this.rounds == null) ? 0 : this.rounds.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        if (this.currentRound == null) {
            if (other.currentRound != null)
                return false;
        } else if (!this.currentRound.equals(other.currentRound))
            return false;
        if (this.drinks == null) {
            if (other.drinks != null)
                return false;
        } else if (!this.drinks.equals(other.drinks))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        } else if (!this.name.equals(other.name))
            return false;
        if (this.players == null) {
            if (other.players != null)
                return false;
        } else if (!this.players.equals(other.players))
            return false;
        if (this.rounds == null) {
            if (other.rounds != null)
                return false;
        } else if (!this.rounds.equals(other.rounds))
            return false;
        return true;
    }

}
