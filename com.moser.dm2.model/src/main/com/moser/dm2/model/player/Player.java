/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.model.player;

import com.moser.dm2.model.Datatype;

/**
 * Player
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class Player extends Datatype {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;

    private String image;

    private Level level;

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
     * Getter for the age.
     * 
     * @return Returns the age.
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * Setter for the age.
     * 
     * @param age
     *            The age to set.
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Getter for the image.
     * 
     * @return Returns the image.
     */
    public String getImage() {
        return this.image;
    }

    /**
     * Setter for the image.
     * 
     * @param image
     *            The image to set.
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Getter for the level.
     * 
     * @return Returns the level.
     */
    public Level getLevel() {
        return this.level;
    }

    /**
     * Setter for the level.
     * 
     * @param level
     *            The level to set.
     */
    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((this.age == null) ? 0 : this.age.hashCode());
        result = prime * result + ((this.image == null) ? 0 : this.image.hashCode());
        result = prime * result + ((this.level == null) ? 0 : this.level.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
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
        Player other = (Player) obj;
        if (this.age == null) {
            if (other.age != null)
                return false;
        } else if (!this.age.equals(other.age))
            return false;
        if (this.image == null) {
            if (other.image != null)
                return false;
        } else if (!this.image.equals(other.image))
            return false;
        if (this.level == null) {
            if (other.level != null)
                return false;
        } else if (!this.level.equals(other.level))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        } else if (!this.name.equals(other.name))
            return false;
        return true;
    }

}
