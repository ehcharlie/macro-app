package com.example.demo.dao;

import com.example.demo.constant.ConstantsAndQueries;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Component
public class RecipeDao {

    @Value("${api-key}")
    private String userApiKey;

    public List<Map<String, String>> getRecipes(String recipe) {

        HttpHeaders headers = new HttpHeaders();

        headers.add("x-api-key", userApiKey);

        RestTemplate restTemplate = new RestTemplate();

        return (List<Map<String, String>>) restTemplate.exchange(
                ConstantsAndQueries.RECIPE_URL + recipe,
                HttpMethod.GET,
                new HttpEntity<>(headers),
                List.class).getBody();
    }
}
