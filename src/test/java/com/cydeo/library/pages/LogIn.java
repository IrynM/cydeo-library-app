package com.cydeo.library.pages;

import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collections;

public class LogIn {

    public LogIn(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement loginButton;

    public void logIn (String username, String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
emailInput.sendKeys(username);
passwordInput.sendKeys(password);
loginButton.click();
        String expectedTitle = "Login - Library";
        String actualTitle =Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.closeDriver();
    }




}
