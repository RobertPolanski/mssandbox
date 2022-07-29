package de.instersoft.mssandbox.msmanager.service;

import de.instersoft.mssandbox.msmanager.config.MsManagerConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CalculatorService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final MsManagerConfiguration msManagerConfiguration;

    public CalculatorService(MsManagerConfiguration msManagerConfiguration) {
        this.msManagerConfiguration = msManagerConfiguration;
    }

    public String sum(Integer a, Integer b) {
        String calculatorUrl = msManagerConfiguration.getCalculatorUrl();
        ResponseEntity<String> response = restTemplate.getForEntity(calculatorUrl + "/sum/" + a + "/" + b, String.class);
        return response.getBody();
    }
}
