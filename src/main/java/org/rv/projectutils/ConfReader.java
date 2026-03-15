package org.rv.projectutils;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

public class ConfReader {
    public String getBaseUrl(){
        return getCustomVariable("webdriver.base.url");
    }
    public String getCustomVariable(String variablePath){
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        return EnvironmentSpecificConfiguration.from(variables)
                .getProperty(variablePath);
    }
}
