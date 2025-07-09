package com.saucedemo.Hooks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import com.saucedemo.Tools.Wdm;

public class Hook {

    @BeforeEach
    public void setup(){
        Wdm.createdriver();
        Wdm.getDriver().get("https://www.saucedemo.com/");    
    }


    @AfterEach
    public void teardown(){
        Wdm.destroydriver();
    }
}
