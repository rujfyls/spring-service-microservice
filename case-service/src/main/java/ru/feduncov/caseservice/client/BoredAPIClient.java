package ru.feduncov.caseservice.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.feduncov.caseservice.entity.Case;

@Component
public class BoredAPIClient {

    private final RestTemplate restTemplate;
    private final static String URL = "https://www.boredapi.com/api/activity";

    public BoredAPIClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Case getRandomCase() {
        return restTemplate.getForObject(URL, Case.class);
    }
}
