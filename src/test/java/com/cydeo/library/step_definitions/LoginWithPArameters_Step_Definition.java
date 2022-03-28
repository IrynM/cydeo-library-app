package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.Dashboard;
import com.cydeo.library.pages.LogIn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginWithPArameters_Step_Definition {
    LogIn logIn= new LogIn();
    Dashboard dashboard= new Dashboard();

    @Then("user enter username {string}")
    public void user_enter_username(String string) {
       logIn.emailInput.sendKeys(string);

    }
    @Then("user enter password {string}")
    public void user_enter_password(String string) {
       logIn.passwordInput.sendKeys(string);
    }


    @When("user click login button")
    public void user_click_login_button() {
        logIn.loginButton.click();
    }




    @Given("user is entered {string} and {string}")
    public void userIsEnteredAnd(String user, String password) {
        logIn.logIn(user, password);
    }

    @And("user click Users button")
    public void userClickUsersButton() {
    dashboard.users.click();
    }






    @Then("verify table have following:")
    public void verifyTableHaveFollowing(List<String> expectedList) {
        List<WebElement> actualelements = dashboard.tableElements;
        List<String> actual = new ArrayList<>();

        for (WebElement each : actualelements) {
            actual.add(each.getText());

        }
        Assert.assertEquals(expectedList, actual);
    }





}
