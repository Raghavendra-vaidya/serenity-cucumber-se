package org.rv.pom;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.rv.projectutils.ConfReader;

public class LoginPage extends PageObject {
    String usernameField = "//input[@name='username']";
    String passwordField = "//input[@name='password']";
    String loginButton = "//button[contains(text(),'Login')]";


    String baseUrl = new ConfReader().getBaseUrl();

    public void visitApp(){
        openUrl(baseUrl);
    }

    public WebElementFacade getUserNameField(){
        return find(usernameField).waitUntilVisible();
    }
    public WebElementFacade getPasswordField(){
        return find(passwordField).waitUntilVisible();
    }
    public WebElementFacade getLoginButton(){
        return find(loginButton).waitUntilClickable();
    }

    public void enterUserName(String username){
        getUserNameField().type(username);
    }
    public void enterPassword(String password){
        getPasswordField().type(password);
    }
    public void clickOnLoginButton(){
        getLoginButton().click();
    }
}
