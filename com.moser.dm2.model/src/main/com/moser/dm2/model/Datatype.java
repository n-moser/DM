/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model;

import java.io.Serializable;

/**
 * Datatype
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public abstract class Datatype implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private final Long creationTime;

    /**
     * Creates a new {@link Datatype} instance.
     */
    protected Datatype() {
        this.creationTime = System.currentTimeMillis();
    }

    /**
     * Getter for the creationTime.
     * 
     * @return Returns the creationTime.
     */
    public final Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * Setter for the id.
     * 
     * @param id
     *            The id to set.
     */
    public final void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for the id.
     * 
     * @return Returns the id.
     */
    public final Long getId() {
        return this.id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.creationTime == null) ? 0 : this.creationTime.hashCode());
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
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
        Datatype other = (Datatype) obj;
        if (this.creationTime == null) {
            if (other.creationTime != null)
                return false;
        } else if (!this.creationTime.equals(other.creationTime))
            return false;
        if (this.id == null) {
            if (other.id != null)
                return false;
        } else if (!this.id.equals(other.id))
            return false;
        return true;
    }

}
