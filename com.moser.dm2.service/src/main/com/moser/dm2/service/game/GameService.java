/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service.game;

import java.util.List;

import com.moser.dm2.model.drink.Drink;
import com.moser.dm2.model.game.Game;
import com.moser.dm2.model.player.Player;
import com.moser.dm2.service.Service;
import com.moser.dm2.service.ServiceException;

/**
 * GameService
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public interface GameService extends Service {

    /**
     * Starts a new Game.
     * 
     * @param name
     *            name of the game
     * @param rounds
     *            amount of rounds
     * @param players
     *            the list of players
     * @param drinks
     *            the list of drinks
     * 
     * @return the new game instance
     * 
     * @throws ServiceException
     *             when the game cannot be started
     */
    Game startNewGame(String name, Integer rounds, List<Player> players, List<Drink> drinks) throws ServiceException;

}
