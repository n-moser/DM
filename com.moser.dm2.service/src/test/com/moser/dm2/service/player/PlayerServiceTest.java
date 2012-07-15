/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service.player;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.moser.dm2.model.player.Player;


/**
 * PlayerServiceTest
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class PlayerServiceTest {

    private PlayerService service;

    @Before
    public void setUp() throws Exception {
        PlayerServiceLocator locator = new PlayerServiceLocator();
        this.service = locator.getService();
    }

    @Test
    public void createNewPlayer() throws Exception {
        Player player = this.service.createNewPlayer("First", 20);
        
        Assert.assertNotNull(player);
        Assert.assertNotNull(player.getName());
        Assert.assertNotNull(player.getAge());
    }
    
    @Test
    public void createNewPlayerWithImage() throws Exception {
        Player player = this.service.createNewPlayer("First", 20, "/first.png");
        
        Assert.assertNotNull(player);
        Assert.assertNotNull(player.getName());
        Assert.assertNotNull(player.getAge());
        Assert.assertNotNull(player.getImage());
        
    }
}

