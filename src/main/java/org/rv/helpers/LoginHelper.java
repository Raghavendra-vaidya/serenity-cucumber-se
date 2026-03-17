package org.rv.helpers;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import org.assertj.core.api.Fail;
import org.rv.pom.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;


public class LoginHelper {

    @Steps
    LoginPage loginPage;


    @Step("Launch app")
    public void launchApp() {
        loginPage.visitApp();
    }

    @Step("Verify fields displayed")
    public void verifyFieldsDisplayed(){
        try {
            Serenity.reportThat(
                    "Verify username field is displayed",
                    ()-> assertThat(loginPage.getUserNameField().isDisplayed()).isTrue()
            );
            Serenity.reportThat(
                    "Verify password field is displayed",
                    ()-> assertThat(loginPage.getPasswordField().isDisplayed()).isTrue()
            );
            Serenity.reportThat("Verify login button is displayed",
                    ()-> assertThat(loginPage.getLoginButton().isDisplayed()).isTrue());
        }
        catch (Exception e){
            Fail.fail(e);
        }
    }

    @Step("Verify field validation message for username and password")
    public void verifyFieldValidationMessage(){
        try {
            loginPage.clickOnLoginButton();
            Serenity.reportThat(
                    "Verify username field validation message is displayed",
                    ()-> assertThat(loginPage.getUsernameValidationElement().waitUntilVisible().and().getTextContent()).isEqualTo("Required")
            );
            Serenity.reportThat(
                    "Verify password field validation message is displayed",
                    ()-> assertThat(loginPage.getPasswordValidationElement().waitUntilVisible().and().getTextContent()).isEqualTo("Required")
            );
        }
        catch (Exception e){
            Fail.fail(e);
        }
    }


    @Step("Enter invalid password and click on login")
    public void enterInvalidPasswordAndClickOnLogin(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("123");
        loginPage.clickOnLoginButton();

    }
    @Step("Enter invalid username and click on login")
    public void enterInvalidUsernameAndClickOnLogin(){
        loginPage.enterUserName("Admin123");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();

    }

    @Step("Enter invalid username and password and  click on login")
    public void enterInvalidCredsAndClickOnLogin(){
        loginPage.enterUserName("abc");
        loginPage.enterPassword("abc");
        loginPage.clickOnLoginButton();

    }

    @Step("Enter valid creds and click on login")
    public void enterValidCredsAndClickOnLogin(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
    }

    @Step("Verify invalid credentials message is displayed")
    public void verifyInvalidCredentialsMessage(){
        Serenity.reportThat(
                "Verify invalid credentials message is displayed",
                ()-> assertThat(loginPage.getInvalidCredsElement().waitUntilVisible().and().getTextContent()).isEqualTo("Invalid credentials")
        );
    }

}
