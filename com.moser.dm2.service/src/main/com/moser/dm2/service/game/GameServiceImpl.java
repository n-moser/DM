/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service.game;

import java.util.List;

import com.moser.dm2.model.drink.Drink;
import com.moser.dm2.model.drink.DrinkInGame;
import com.moser.dm2.model.game.Game;
import com.moser.dm2.model.player.Player;
import com.moser.dm2.model.player.PlayerInGame;
import com.moser.dm2.model.session.Session;
import com.moser.dm2.service.ServiceException;
import com.moser.dm2.service.ServiceSupport;

/**
 * GameServiceImpl
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class GameServiceImpl extends ServiceSupport implements GameService {

    private static final long serialVersionUID = 1L;

    @Override
    public Game startNewGame(String name, Integer rounds, List<Player> players, List<Drink> drinks)
            throws ServiceException {

        if (Session.getInstance().getGame() != null) {
            throw new ServiceException("Game is already running!");
        }

        Game game = new Game();
        game.setName(name);
        game.setRounds(rounds);

        for (Drink drink : drinks) {
            DrinkInGame drinkInGame = new DrinkInGame(drink);
            game.getDrinks().add(drinkInGame);
        }

        for (Player player : players) {
            PlayerInGame playerInGame = new PlayerInGame(player);
            game.getPlayers().add(playerInGame);
        }

        Session.getInstance().setGame(game);

        return game;
    }

}
