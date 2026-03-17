package org.rv.steps;

import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.rv.helpers.DashboardHelper;
import org.rv.pom.DashboardPage;

public class DashboardStepDefinitions {
    @Steps
    DashboardHelper dashboardHelper;

    @Then("Verify dashboard page is displayed")
    public void verifyDashboardPageIsDisplayed() {
        dashboardHelper.verifyMenuItemsDisplayed();
    }
}
