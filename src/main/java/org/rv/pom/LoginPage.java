package org.rv.pom;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.rv.projectutils.ConfReader;

public class LoginPage extends PageObject {
    String usernameField = "//input[@name='username']";
    String passwordField = "//input[@name='password']";
    String loginButton = "//button";
    String usernameValidationElement = "//input[@name='username']/parent::div/following-sibling::span";
    String passwordValidationElement = "//input[@name='password']/parent::div/following-sibling::span";
    String invalidCredsElement = "//p[text()='Invalid credentials']";



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
    public WebElementFacade getUsernameValidationElement(){
        return find(usernameValidationElement);
    }
    public WebElementFacade getPasswordValidationElement(){
        return find(passwordValidationElement);
    }
    public WebElementFacade getInvalidCredsElement(){
        return find(invalidCredsElement);
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
