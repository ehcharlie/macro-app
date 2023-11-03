package com.example.macro.nutrition.dao;

import com.example.macro.nutrition.constant.NutritionConstant;
import com.example.macro.nutrition.model.Nutrition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Component
public class NutritionDao {

    @Value("${api-key}")
    private String userApiKey;

    public List<Nutrition> getNutritionValuesForItems(String food) {
        HttpHeaders headers = new HttpHeaders();

        headers.add("x-api-key", userApiKey);

        RestTemplate restTemplate = new RestTemplate();

        return List.of(Objects.requireNonNull(restTemplate.exchange(
                NutritionConstant.NUTRITION_URL + food,
                HttpMethod.GET,
                new HttpEntity<>(headers),
                Nutrition[].class).getBody()));
    }
}
