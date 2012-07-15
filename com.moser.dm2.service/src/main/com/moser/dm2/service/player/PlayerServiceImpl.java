/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service.player;

import com.moser.dm2.model.player.Level;
import com.moser.dm2.model.player.LevelType;
import com.moser.dm2.model.player.Player;
import com.moser.dm2.service.ServiceException;
import com.moser.dm2.service.ServiceSupport;

/**
 * PlayerServiceImpl
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
class PlayerServiceImpl extends ServiceSupport implements PlayerService {

    private static final long serialVersionUID = 1L;

    @Override
    public Player createNewPlayer(String name, Integer age) throws ServiceException {
        return this.createNewPlayer(name, age, null);
    }

    @Override
    public Player createNewPlayer(String name, Integer age, String image) throws ServiceException {

        Player player = new Player();

        player.setName(name);
        player.setAge(age);
        player.setImage(image);

        Level level = new Level();
        level.setType(LevelType.BEGINNER);
        player.setLevel(level);

        return player;
    }

}
