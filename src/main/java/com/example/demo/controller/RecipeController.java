package com.example.demo.controller;

import com.example.demo.constant.ConstantsAndQueries;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Value("${api-key}")
    private String userApiKey;

    //TODO: Convert this into a serializable object to return response
    @GetMapping()
    public ResponseEntity getRecipe() {
        HttpHeaders headers = new HttpHeaders();

        headers.add("x-api-key", userApiKey);

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.exchange(
                ConstantsAndQueries.RECIPE_URL + "pork",
                HttpMethod.GET,
                new HttpEntity<>(headers),
                Object.class);
    }
}