package com.saucedemo.Hooks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import com.saucedemo.Tools.Wdm;

public class Hook {
    @BeforeEach
    public void setup(){
        Wdm.createdriver();
    }
    @AfterEach
    public void teardown(){
        Wdm.destroydriver();
    }
}
