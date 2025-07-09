package com.saucedemo.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.saucedemo.Pages.loginpage;
import com.saucedemo.Tools.Wdm;

public class logintest {
    @Test
    public void lp(){
        loginpage lp = new loginpage(Wdm.getDriver());
        lp.saisirusername("standard_user");
        lp.saisirpassword("secret_sauce");
        lp.clickbtn();
        assertTrue(Wdm.getDriver().findElement(By.cssSelector("span[data-test='title']")).isDisplayed());
    }
    
}
