/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service;

import org.junit.Assert;
import org.junit.Test;

import com.moser.dm2.service.game.GameService;
import com.moser.dm2.service.game.GameServiceLocator;


/**
 * ServiceLocatorTest
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class ServiceLocatorTest {

    @Test
    public void getService() throws Exception{
        
        ServiceLocator<GameService> locator = new GameServiceLocator();
        GameService service = locator.getService();
        
        Assert.assertNotNull(service);
    }
    
}
