package com.saucedemo.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wdm {
    public static WebDriver driver;
    public static void createdriver (){
        driver = new ChromeDriver();
    }
    public static void destroydriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
    public  static WebDriver getDriver(){
        return driver;
    }
}
