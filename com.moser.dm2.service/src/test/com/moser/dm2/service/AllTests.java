/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * AllTests
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    
    com.moser.dm2.service.drink.AllTests.class,
    com.moser.dm2.service.game.AllTests.class,
    com.moser.dm2.service.player.AllTests.class,
    
    com.moser.dm2.service.ServiceLocatorTest.class
    
})
public class AllTests {

}
