/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.game;

import java.util.ArrayList;
import java.util.List;

import com.moser.dm2.model.Datatype;
import com.moser.dm2.model.drink.Drink;
import com.moser.dm2.model.player.Player;

/**
 * Configuration
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class Configuration extends Datatype {

    private static final long serialVersionUID = 1L;

    private String name;

    private List<Player> players;

    private List<Drink> drinks;

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
     * Getter for the players.
     * 
     * @return Returns the players.
     */
    public List<Player> getPlayers() {
        if (this.players == null) {
            this.players = new ArrayList<Player>();
        }
        return this.players;
    }

    /**
     * Getter for the drinks.
     * 
     * @return Returns the drinks.
     */
    public List<Drink> getDrinks() {
        if (this.drinks == null) {
            this.drinks = new ArrayList<Drink>();
        }
        return this.drinks;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((this.drinks == null) ? 0 : this.drinks.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.players == null) ? 0 : this.players.hashCode());
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
        Configuration other = (Configuration) obj;
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
        return true;
    }

}
