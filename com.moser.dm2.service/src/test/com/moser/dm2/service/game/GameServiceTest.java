/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service.game;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.moser.dm2.model.drink.Drink;
import com.moser.dm2.model.drink.DrinkType;
import com.moser.dm2.model.game.Game;
import com.moser.dm2.model.player.Player;
import com.moser.dm2.model.turn.BasicTurn;
import com.moser.dm2.model.turn.Turn;
import com.moser.dm2.model.turn.TurnType;
import com.moser.dm2.service.ServiceException;

/**
 * GameServiceTest
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class GameServiceTest {

    private GameService service;

    @Before
    public void setUp() throws Exception {
        GameServiceLocator locator = new GameServiceLocator();
        this.service = locator.getService();
    }

    @Test
    public void startNewGame() throws Exception {

        Game game = this.createNewGame("First", "Second");

        Assert.assertNotNull(game);
        Assert.assertNotNull(game.getName());
        Assert.assertNotNull(game.getCreationTime());
        Assert.assertNotNull(game.getCurrentRound());

        Assert.assertEquals(0, game.getCurrentRound().intValue());
        Assert.assertEquals(100, game.getRounds().intValue());
    }

    @Test
    public void testRound() throws Exception {

        Game game = this.createNewGame("Nico", "Janina", "Dario", "B‰rbel", "Simon", "Dirk", "Scheuber", "Constanze", "Malle");

        Turn turn = this.service.nextTurn(game);
        
        Assert.assertNotNull(turn);
        Assert.assertSame(TurnType.BASIC, turn.getType());

        Assert.assertEquals(1, turn.getRound().intValue());
        
        while(turn.getType() != TurnType.FINAL) {
            BasicTurn basicTurn = (BasicTurn) turn;
            System.out.println(basicTurn);
            
            Thread.sleep(500);
            
            turn = this.service.nextTurn(game);
        }
        
        System.out.println(turn);
    }

    /**
     * Creates a new Game.
     * 
     * @throws ServiceException
     */
    private Game createNewGame(String... playerNames) throws ServiceException {
        
        List<Player> players = new ArrayList<Player>();

        for (String name : playerNames) {
            Player player = new Player();
            player.setName(name);

            players.add(player);
        }

        Drink water = new Drink();
        water.setName("Wasser");
        water.setDescription("Wasser");
        water.setVolumePercentage(new BigDecimal(0));
        water.setType(DrinkType.NON_ALCOHOLIC);

        Drink beer = new Drink();
        beer.setName("Franziskaner");
        beer.setDescription("Franziskaner Weiﬂbier");
        beer.setVolumePercentage(new BigDecimal(5.5));
        beer.setType(DrinkType.BEER);
        
        Drink wine = new Drink();
        wine.setName("Merlot");
        wine.setDescription("Rotwein");
        wine.setVolumePercentage(new BigDecimal(12.5));
        wine.setType(DrinkType.BEER);
        
        Drink vodka = new Drink();
        vodka.setName("Vodka");
        vodka.setDescription("Grey Goose Vodka");
        vodka.setVolumePercentage(new BigDecimal(40));
        vodka.setType(DrinkType.VODKA);

        List<Drink> drinks = Arrays.asList(water, beer, wine, vodka);

        return this.service.startNewGame("Game 001", 100, players, drinks);
    }

}
