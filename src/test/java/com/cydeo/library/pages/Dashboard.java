package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Dashboard {

    public Dashboard(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement users;


    @FindBy(xpath = "//table//thead//th")
    public List<WebElement>  tableElements;

    @FindBy(xpath = "//a[@id='navbarDropdown']//span")
public WebElement username;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement logOutButton;

}
