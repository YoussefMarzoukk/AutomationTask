package com.saucedemo.Pages;

import com.saucedemo.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By welcomeMSG = By.cssSelector("div[class^='app']");

    public boolean isWelcomeMSGVisible(){
        return driver.findElement(welcomeMSG).isDisplayed();
    }

}

