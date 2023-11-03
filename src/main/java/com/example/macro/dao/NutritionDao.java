package com.example.macro.dao;

import com.example.macro.constant.ConstantsAndQueries;
import com.example.macro.model.Nutrition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class NutritionDao {

    @Value("${api-key}")
    private String userApiKey;

    public List<Nutrition> getNutritionValuesForItems(String food) {
        HttpHeaders headers = new HttpHeaders();

        headers.add("x-api-key", userApiKey);

        RestTemplate restTemplate = new RestTemplate();

        return List.of(restTemplate.exchange(
                ConstantsAndQueries.NUTRITION_URL + food,
                HttpMethod.GET,
                new HttpEntity<>(headers),
                Nutrition[].class).getBody());
}}
