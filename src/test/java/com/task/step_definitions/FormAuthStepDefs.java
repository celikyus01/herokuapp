package com.task.step_definitions;

import com.task.pages.FormAuthPage;
import com.task.utilities.ConfigurationReader;
import com.task.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FormAuthStepDefs {



    @Given("the user is in main page")
    public void the_user_is_in_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }


    @When("the user navigates to {string} page")
    public void theUserNavigatesToPage(String page) {
        new FormAuthPage().navigateToMenu(page);

    }


    @Then("user verifies title as {string}")
    public void userVerifiesTitleAs(String expectedTitle) {
        String actualTitle = new FormAuthPage().getMainTitle();
        Assert.assertEquals(expectedTitle+ " can not be verified.. ",expectedTitle,actualTitle);
    }


    @When("the user logs in with {string} and {string} credentials")
    public void theUserLogsInWithAndCredentials(String username, String password) {
        new FormAuthPage().login(username,password);

    }

    @Then("the user clicks on {string} button")
    public void theUserClicksOnButton(String buttonName) {
        new FormAuthPage().clickButton(buttonName);

    }


}
