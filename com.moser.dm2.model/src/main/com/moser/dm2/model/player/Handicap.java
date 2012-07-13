/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.player;

import java.math.BigDecimal;

import com.moser.dm2.model.Datatype;

/**
 * Handicap
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class Handicap extends Datatype {

    private static final long serialVersionUID = 1L;

    private HandicapType type;

    private BigDecimal percentage;

    /**
     * Creates a new {@link Handicap} instance.
     * 
     * @param type
     *            the handicap type
     */
    private Handicap(HandicapType type) {
        if (type == null) {
            throw new IllegalArgumentException("Cannot create Handicap for type [null].");
        }

        this.type = type;
    }

    /**
     * Getter for the type.
     * 
     * @return Returns the type.
     */
    public HandicapType getType() {
        return this.type;
    }

    /**
     * Getter for the percentage.
     * 
     * @return Returns the percentage.
     */
    public BigDecimal getPercentage() {
        return this.percentage;
    }

    /**
     * Setter for the percentage.
     * 
     * @param percentage
     *            The percentage to set.
     */
    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }
}
