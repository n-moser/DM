/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.ui.action;

import java.io.File;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;

/**
 * ActionIconTest
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class ActionIconTest {

    @Test
    public void test() {

        URL resource = ActionIconTest.class.getResource("/exit.png");
        
        System.out.println(resource);
        
        File file = new File(resource.toString());
        
        System.out.println(file);

        Assert.assertNotNull(file);
        Assert.assertTrue(file.exists());
    }

}
