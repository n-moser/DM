/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.player;

import java.util.ArrayList;
import java.util.List;

import com.moser.dm2.model.Datatype;
import com.moser.dm2.model.drink.DrinkInGame;

/**
 * PlayerInGame
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class PlayerInGame extends Datatype {

    private static final long serialVersionUID = 1L;

    private final Player player;

    private ColorType color;

    private List<Handicap> handicaps;

    private List<DrinkInGame> drinks;

    /**
     * Creates a new {@link PlayerInGame} instance.
     * 
     * @param player
     *            the player
     */
    public PlayerInGame(Player player) {
        if (player == null) {
            throw new IllegalArgumentException("Cannot create PlayerInGame for Player [null].");
        }
        this.player = player;
    }

    /**
     * Getter for the player.
     * 
     * @return Returns the player.
     */
    public Player getPlayer() {
        return this.player;
    }

    /**
     * Getter for the color.
     * 
     * @return Returns the color.
     */
    public ColorType getColor() {
        return this.color;
    }

    /**
     * Setter for the color.
     * 
     * @param color
     *            The color to set.
     */
    public void setColor(ColorType color) {
        this.color = color;
    }

    /**
     * Getter for the handicaps.
     * 
     * @return Returns the handicaps.
     */
    public List<Handicap> getHandicaps() {
        if (this.handicaps == null) {
            this.handicaps = new ArrayList<Handicap>();
        }
        return this.handicaps;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((this.color == null) ? 0 : this.color.hashCode());
        result = prime * result + ((this.drinks == null) ? 0 : this.drinks.hashCode());
        result = prime * result + ((this.handicaps == null) ? 0 : this.handicaps.hashCode());
        result = prime * result + ((this.player == null) ? 0 : this.player.hashCode());
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
        PlayerInGame other = (PlayerInGame) obj;
        if (this.color != other.color)
            return false;
        if (this.drinks == null) {
            if (other.drinks != null)
                return false;
        } else if (!this.drinks.equals(other.drinks))
            return false;
        if (this.handicaps == null) {
            if (other.handicaps != null)
                return false;
        } else if (!this.handicaps.equals(other.handicaps))
            return false;
        if (this.player == null) {
            if (other.player != null)
                return false;
        } else if (!this.player.equals(other.player))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return this.player.toString();
    }

}
