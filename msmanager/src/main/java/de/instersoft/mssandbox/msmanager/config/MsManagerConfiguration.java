package de.instersoft.mssandbox.msmanager.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "msmanager")
public class MsManagerConfiguration {
    private String calculatorUrl;

    public String getCalculatorUrl() {
        return calculatorUrl;
    }

    public void setCalculatorUrl(String calculatorUrl) {
        this.calculatorUrl = calculatorUrl;
    }
}
