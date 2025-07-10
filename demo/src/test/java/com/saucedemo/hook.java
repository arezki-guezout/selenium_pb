package com.saucedemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import com.saucedemo.tools.wdm;

public class hook {

    @BeforeEach
    public void setup(){
        System.out.println("ttttttttttttttttttttttttttttttt");
        wdm.createdriver();
        wdm.getDriver().get("https://www.saucedemo.com/");    
    }


    @AfterEach
    public void teardown(){
        wdm.destroydriver();
    }
}
