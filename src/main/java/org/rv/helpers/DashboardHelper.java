package org.rv.helpers;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import org.rv.pom.DashboardPage;

import static org.assertj.core.api.Assertions.assertThat;

public class DashboardHelper {

    @Steps
    DashboardPage dashboardPage;

     public void verifyMenuItemsDisplayed()
     {
         Serenity.reportThat(
                 "Verify menu list is displayed",
                 ()-> assertThat(dashboardPage.getMenuList().waitUntilVisible().and().isDisplayed()).isTrue()
         );
     }
}
