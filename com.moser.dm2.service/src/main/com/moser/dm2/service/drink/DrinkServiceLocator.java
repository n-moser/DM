/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.service.drink;

import com.moser.dm2.service.ServiceLocator;


/**
 * DrinkServiceLocator
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class DrinkServiceLocator extends ServiceLocator<DrinkService> {

    @Override
    public DrinkService getService() {
        return new DrinkServiceImpl();
    }

}
