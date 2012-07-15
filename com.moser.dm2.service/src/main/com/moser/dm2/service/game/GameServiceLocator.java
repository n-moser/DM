/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service.game;

import com.moser.dm2.service.ServiceLocator;

/**
 * GameServiceLocator
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class GameServiceLocator extends ServiceLocator<GameService> {

    @Override
    public GameService getService() {
        return new GameServiceImpl();
    }

}
