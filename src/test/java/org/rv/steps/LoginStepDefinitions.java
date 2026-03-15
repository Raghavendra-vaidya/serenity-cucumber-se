package org.rv.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.rv.helpers.LoginHelper;

public class LoginStepDefinitions {

    @Steps
    LoginHelper loginHelper;

    @Given("User launches orangeHRM")
    public void user_launches_orangeHRM() {
        loginHelper.launchApp();
    }

    @Then("Verify login page is loaded and fields are displayed")
    public void verify_fields_are_displayed() {
        loginHelper.verifyFieldsDisplayed();
    }
}
