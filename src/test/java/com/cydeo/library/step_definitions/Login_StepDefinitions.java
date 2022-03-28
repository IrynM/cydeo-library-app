package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LogIn;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {
    LogIn logIn = new LogIn();


    @Given("user is on log in page")
    public void userIsOnLogInPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }
    @Then("Librarian enter username")
    public void librarianEnterUsername() {
        logIn.emailInput.sendKeys(ConfigurationReader.getProperty("librarUser"));
    }

    @Then("Librarian enter password")
    public void librarian_enter_password() {
        logIn.passwordInput.sendKeys(ConfigurationReader.getProperty("librarPass"));
    }
    @When("Librarian click login button")
    public void librarian_click_login_button() {
        logIn.loginButton.click();

    }


    @Then("verify user is in library page")
    public void verifyUserIsInLibraryPage() {
        String expectedTitle = "Login - Library";
        String actualTitle =Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        Driver.closeDriver();
    }


    @Given("Student is on log in page")
    public void studentIsOnLogInPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }

    @Then("Student enter username")
    public void studentEnterUsername() {
        logIn.emailInput.sendKeys(ConfigurationReader.getProperty("studentUser"));
    }

    @And("Student enter password")
    public void studentEnterPassword() {
        logIn.passwordInput.sendKeys(ConfigurationReader.getProperty("studenPass"));
    }

    @When("Student click login button")
    public void studentClickLoginButton() {
        logIn.loginButton.click();
    }
}
