/*
 * Copyright 2012 Nicolas Moser.
 */
package com.moser.dm2.ui.web;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.appengine.tools.KickStart;

/**
 * WebApplicationLauncher
 * 
 * @author Nicolas Moser, PRODYNA AG
 */
public class WebApplicationLauncher {

    private static final String SERVER_CLASS = "com.google.appengine.tools.development.DevAppServerMain";

    private static final String GOOGLE_SDK = "-sdk_root=D:\\Tools\\appengine-java-sdk-1.7.0";
    
    private static final String EXPANDED_PATH = "out/ant/expanded/com.moser.dm2.ui.web.war";

    @Test
    public void launch() throws Exception {

        List<String> arguments = new ArrayList<String>();
        arguments.add(SERVER_CLASS);
        arguments.add(GOOGLE_SDK);
        arguments.add(EXPANDED_PATH);

        KickStart.main(arguments.toArray(new String[arguments.size()]));
    }
}
