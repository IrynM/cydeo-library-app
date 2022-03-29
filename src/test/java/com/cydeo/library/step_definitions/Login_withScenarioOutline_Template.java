package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.Dashboard;
import com.cydeo.library.pages.LogIn;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_withScenarioOutline_Template {

    LogIn logIn = new LogIn();
    Dashboard dashboard = new Dashboard();

    @Then("As a user, I should be able to login with different users using their correct {string} and {string}")
    public void asAUserIShouldBeAbleToLoginWithDifferentUsersUsingTheirCorrectAnd(String email, String pass) {
        logIn.emailInput.sendKeys(email);
        logIn.passwordInput.sendKeys(pass);
        logIn.loginButton.click();
        BrowserUtils.sleep(2);
    }


    @And("When I login, I should be able to see username in the account username section {string}")
    public void whenILoginIShouldBeAbleToSeeUsernameInTheAccountUsernameSection(String name) {

        String actualname = dashboard.username.getText();
        System.out.println("usernameText = " + name);
        BrowserUtils.sleep(1);
        Assert.assertEquals(name, actualname);


    }
}
