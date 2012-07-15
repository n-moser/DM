/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service.player;

import com.moser.dm2.service.ServiceLocator;


/**
 * PlayerServiceLocator
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class PlayerServiceLocator extends ServiceLocator<PlayerService> {

    @Override
    public PlayerService getService() {
        return new PlayerServiceImpl();
    }

}
