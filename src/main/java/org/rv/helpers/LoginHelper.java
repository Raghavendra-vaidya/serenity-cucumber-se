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

}
