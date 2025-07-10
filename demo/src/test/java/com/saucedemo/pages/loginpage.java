package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
    
    @FindBy(id="user-name")
    WebElement username;
    @FindBy(id="password")
    WebElement password;
    @FindBy(id="login-button")
    WebElement login;

    public loginpage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void saisirusername (String un){
        this.username.sendKeys(un);
    }
    public void saisirpassword(String pw){
        this.password.sendKeys(pw);
    }
    public void clickbtn(){
        this.login.click();
    }
}
