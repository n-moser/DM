/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service.game;

import java.util.List;
import java.util.Random;

import com.moser.dm2.model.drink.Drink;
import com.moser.dm2.model.drink.DrinkInGame;
import com.moser.dm2.model.game.Game;
import com.moser.dm2.model.player.Player;
import com.moser.dm2.model.player.PlayerInGame;
import com.moser.dm2.model.turn.BasicTurn;
import com.moser.dm2.model.turn.FinalTurn;
import com.moser.dm2.model.turn.Turn;
import com.moser.dm2.persistence.session.Session;
import com.moser.dm2.persistence.session.SessionFactory;
import com.moser.dm2.service.ServiceException;
import com.moser.dm2.service.ServiceSupport;

/**
 * GameServiceImpl
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
class GameServiceImpl extends ServiceSupport implements GameService {

    private static final long serialVersionUID = 1L;

    @Override
    public Game startNewGame(String name, Integer rounds, List<Player> players, List<Drink> drinks)
            throws ServiceException {

        SessionFactory factory = new SessionFactory();
        Session session = factory.getSession();

        if (session.getGame() != null) {
            throw new ServiceException("Game is already running!");
        }

        Game game = new Game();
        game.setName(name);
        game.setRounds(rounds);
        game.setCurrentRound(0);

        for (Drink drink : drinks) {
            DrinkInGame drinkInGame = new DrinkInGame(drink);
            game.getDrinks().add(drinkInGame);
        }

        for (Player player : players) {
            PlayerInGame playerInGame = new PlayerInGame(player);
            game.getPlayers().add(playerInGame);
        }

        session.setGame(game);

        return game;
    }

    @Override
    public Turn nextTurn(Game game) {

        game.setCurrentRound(game.getCurrentRound() + 1);

        Turn turn = this.createTurn(game);
        game.getHistory().add(turn);

        return turn;
    }

    /**
     * Creates the next Turn
     * 
     * @param game
     *            the game
     * 
     * @return the next turn
     */
    private Turn createTurn(Game game) {

        if (game.getCurrentRound() >= game.getRounds()) {
            return new FinalTurn(game.getCurrentRound());
        }

        PlayerInGame player = this.selectPlayer(game);
        DrinkInGame drink = this.selectDrink(game);

        return new BasicTurn(drink, player, game.getCurrentRound());
    }

    /**
     * Select a random player.
     * 
     * @param game
     *            the game holding the players
     * 
     * @return the radomly selected player
     */
    private PlayerInGame selectPlayer(Game game) {

        Random random = new Random();
        int index = random.nextInt(game.getPlayers().size());

        return game.getPlayers().get(index);
    }

    /**
     * Select a random drink.
     * 
     * @param game
     *            the game holding the drinks
     * 
     * @return the radomly selected drink
     */
    private DrinkInGame selectDrink(Game game) {

        Random random = new Random();
        int index = random.nextInt(game.getDrinks().size());

        return game.getDrinks().get(index);
    }
}
