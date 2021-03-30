package com.mavenrepository.stepdefinitions;

import base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
    @Before
    public void start(){
        System.out.println("start");
       BasePage.initializedriver();

    }

//    @After
//    public void end(){
//        BasePage.tearDown();
//    }


}