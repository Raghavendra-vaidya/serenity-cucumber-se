package org.rv.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.rv.helpers.DashboardHelper;
import org.rv.helpers.LoginHelper;
import org.rv.pom.DashboardPage;

public class LoginStepDefinitions {

    @Steps
    LoginHelper loginHelper;

    @Steps
    DashboardHelper dashboardHelper;

    @Given("User launches orangeHRM")
    public void user_launches_orangeHRM() {
        loginHelper.launchApp();
    }

    @Then("Verify login page is loaded and fields are displayed")
    public void verify_fields_are_displayed() {
        loginHelper.verifyFieldsDisplayed();
    }

    @Then("Click on login button without entering username and password and Verify error message")
    public void clickOnLoginAndVerifyErrorMessage() {
        loginHelper.verifyFieldValidationMessage();
    }
    @Then("Enter invalid password and Verify error message")
    public void enterInvalidPasswordAndVerifyErrorMessage() {
        loginHelper.enterInvalidPasswordAndClickOnLogin();
        loginHelper.verifyInvalidCredentialsMessage();
    }
    @Then("Enter invalid username and Verify error message")
    public void enterInvalidUsernameAndVerifyErrorMessage() {
        loginHelper.enterInvalidUsernameAndClickOnLogin();
        loginHelper.verifyInvalidCredentialsMessage();
    }

    @Then("Enter invalid username and password and Verify error message")
    public void enterInvalidCredsAndVerifyErrorMessage() {
        loginHelper.enterInvalidCredsAndClickOnLogin();
        loginHelper.verifyInvalidCredentialsMessage();
    }
    @And("Enter valid credentials and click on login")
    public void enterValidCredentialsAndClickOnLogin() {
        loginHelper.enterValidCredsAndClickOnLogin();
    }

}
