/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service.player;

import com.moser.dm2.model.player.Player;
import com.moser.dm2.service.Service;
import com.moser.dm2.service.ServiceException;

/**
 * PlayerService
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public interface PlayerService extends Service {

    /**
     * Creates a new Player instance.
     * 
     * @param name
     *            name of the player
     * @param age
     *            age of the player
     * @param image
     *            the player image location
     * 
     * @return the new player instance
     * 
     * @throws ServiceException
     *             when the player cannot be created
     */
    Player createNewPlayer(String name, Integer age, String image) throws ServiceException;

    /**
     * Creates a new Player instance.
     * 
     * @param name
     *            name of the player
     * @param age
     *            age of the player
     * 
     * @return the new player instance
     * 
     * @throws ServiceException
     *             when the player cannot be created
     */
    Player createNewPlayer(String name, Integer age) throws ServiceException;

}
