/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.player;

import com.moser.dm2.model.Datatype;

/**
 * Level
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class Level extends Datatype {

    private static final long serialVersionUID = 1L;

    private LevelType type;

    private Integer finishedGames;
    
    private Integer wonGames;
    
    private Integer lostGames;

    
    /**
     * Getter for the type.
     * 
     * @return Returns the type.
     */
    public LevelType getType() {
        return this.type;
    }

    
    /**
     * Setter for the type.
     * 
     * @param type The type to set.
     */
    public void setType(LevelType type) {
        this.type = type;
    }

    
    /**
     * Getter for the finishedGames.
     * 
     * @return Returns the finishedGames.
     */
    public Integer getFinishedGames() {
        return this.finishedGames;
    }

    
    /**
     * Setter for the finishedGames.
     * 
     * @param finishedGames The finishedGames to set.
     */
    public void setFinishedGames(Integer finishedGames) {
        this.finishedGames = finishedGames;
    }

    
    /**
     * Getter for the wonGames.
     * 
     * @return Returns the wonGames.
     */
    public Integer getWonGames() {
        return this.wonGames;
    }

    
    /**
     * Setter for the wonGames.
     * 
     * @param wonGames The wonGames to set.
     */
    public void setWonGames(Integer wonGames) {
        this.wonGames = wonGames;
    }

    
    /**
     * Getter for the lostGames.
     * 
     * @return Returns the lostGames.
     */
    public Integer getLostGames() {
        return this.lostGames;
    }

    
    /**
     * Setter for the lostGames.
     * 
     * @param lostGames The lostGames to set.
     */
    public void setLostGames(Integer lostGames) {
        this.lostGames = lostGames;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((this.finishedGames == null) ? 0 : this.finishedGames.hashCode());
        result = prime * result + ((this.lostGames == null) ? 0 : this.lostGames.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.wonGames == null) ? 0 : this.wonGames.hashCode());
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
        Level other = (Level) obj;
        if (this.finishedGames == null) {
            if (other.finishedGames != null)
                return false;
        } else if (!this.finishedGames.equals(other.finishedGames))
            return false;
        if (this.lostGames == null) {
            if (other.lostGames != null)
                return false;
        } else if (!this.lostGames.equals(other.lostGames))
            return false;
        if (this.type != other.type)
            return false;
        if (this.wonGames == null) {
            if (other.wonGames != null)
                return false;
        } else if (!this.wonGames.equals(other.wonGames))
            return false;
        return true;
    }
    
}
