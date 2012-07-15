/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.drink;

import java.math.BigDecimal;

import com.moser.dm2.model.Datatype;

/**
 * Drink
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class Drink extends Datatype {

    private static final long serialVersionUID = 1L;

    private String name;

    private String description;

    private DrinkType type;

    private BigDecimal volumePercentage;

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
     * Getter for the description.
     * 
     * @return Returns the description.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for the description.
     * 
     * @param description
     *            The description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for the type.
     * 
     * @return Returns the type.
     */
    public DrinkType getType() {
        return this.type;
    }

    /**
     * Setter for the type.
     * 
     * @param type
     *            The type to set.
     */
    public void setType(DrinkType type) {
        this.type = type;
    }

    /**
     * Getter for the volumePercentage.
     * 
     * @return Returns the volumePercentage.
     */
    public BigDecimal getVolumePercentage() {
        return this.volumePercentage;
    }

    /**
     * Setter for the volumePercentage.
     * 
     * @param volumePercentage
     *            The volumePercentage to set.
     */
    public void setVolumePercentage(BigDecimal volumePercentage) {
        this.volumePercentage = volumePercentage;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.volumePercentage == null) ? 0 : this.volumePercentage.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Drink other = (Drink) obj;
        if (this.description == null) {
            if (other.description != null)
                return false;
        } else if (!this.description.equals(other.description))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        } else if (!this.name.equals(other.name))
            return false;
        if (this.type != other.type)
            return false;
        if (this.volumePercentage == null) {
            if (other.volumePercentage != null)
                return false;
        } else if (!this.volumePercentage.equals(other.volumePercentage))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.valueOf(this.name));
        result.append(" (");
        if (this.volumePercentage == null) {
            result.append("0.0");
        } else {
            result.append(this.volumePercentage);
        }
        result.append("% Vol.");
        result.append(")");
        return result.toString();
    }
}
