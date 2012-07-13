/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.drink;

import com.moser.dm2.model.Datatype;

/**
 * DrinkInGame
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class DrinkInGame extends Datatype {

    private static final long serialVersionUID = 1L;

    private final Drink drink;

    private Integer amount;

    private Integer glasSize;

    /**
     * Creates a new {@link DrinkInGame} instance.
     * 
     * @param drink
     *            the drink
     */
    public DrinkInGame(Drink drink) {
        if (drink == null) {
            throw new IllegalArgumentException("Cannot create DrinkInGame for Drink [null].");
        }

        this.drink = drink;
    }

    /**
     * Getter for the drink.
     * 
     * @return Returns the drink.
     */
    public Drink getDrink() {
        return this.drink;
    }

    /**
     * Getter for the amount.
     * 
     * @return Returns the amount.
     */
    public Integer getAmount() {
        return this.amount;
    };

    /**
     * Setter for the amount.
     * 
     * @param amount
     *            The amount to set.
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for the glasSize.
     * 
     * @return Returns the glasSize.
     */
    public Integer getGlasSize() {
        return this.glasSize;
    }

    /**
     * Setter for the glasSize.
     * 
     * @param glasSize
     *            The glasSize to set.
     */
    public void setGlasSize(Integer glasSize) {
        this.glasSize = glasSize;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.drink == null) ? 0 : this.drink.hashCode());
        result = prime * result + ((this.glasSize == null) ? 0 : this.glasSize.hashCode());
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
        DrinkInGame other = (DrinkInGame) obj;
        if (this.amount == null) {
            if (other.amount != null)
                return false;
        } else if (!this.amount.equals(other.amount))
            return false;
        if (this.drink == null) {
            if (other.drink != null)
                return false;
        } else if (!this.drink.equals(other.drink))
            return false;
        if (this.glasSize == null) {
            if (other.glasSize != null)
                return false;
        } else if (!this.glasSize.equals(other.glasSize))
            return false;
        return true;
    }

}
