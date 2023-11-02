package com.example.demo.controller;

import com.example.demo.constant.ConstantsAndQueries;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nutrition-values")
public class NutritionController {

    @Value("${api-key}")
    private String userApiKey;

    //TODO: Convert this into a serializable object to return response
    @GetMapping()
    public ResponseEntity<String> getNutritionValuesforItems() {
        HttpHeaders headers = new HttpHeaders();

        headers.add("x-api-key", userApiKey);

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.exchange(
                ConstantsAndQueries.NUTRITION_URL + "Tomato",
                HttpMethod.GET,
                new HttpEntity<>(headers),
                String.class);
    }
}