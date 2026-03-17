package org.rv.pom;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DashboardPage extends PageObject {

    String menuList = "//ul[@class='oxd-main-menu']";


    public WebElementFacade getMenuList() {
        return $(menuList);
    }

}
