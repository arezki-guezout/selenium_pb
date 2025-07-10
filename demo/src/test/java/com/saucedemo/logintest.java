package com.saucedemo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.saucedemo.pages.loginpage;
import com.saucedemo.tools.wdm;

public class logintest {
    @Test
    public void lpt(){
        loginpage lp = new loginpage(wdm.getDriver());
        lp.saisirusername("standard_user");
        lp.saisirpassword("secret_sauce");
        lp.clickbtn();
        assertTrue(wdm.getDriver().findElement(By.cssSelector("span[data-test='title']")).isDisplayed());
    }
    
}
