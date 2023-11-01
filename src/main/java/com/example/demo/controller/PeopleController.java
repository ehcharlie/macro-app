package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PeopleService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class PeopleController {

    private static final String NUTRITION_URL = "https://api.calorieninjas.com/v1/nutrition?query=";

    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("/people")
    public Person getPeople() {
        return peopleService.getPeople();
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        HttpHeaders headers = new HttpHeaders();

        headers.add("x-api-key", "GDKdEPuI44WKjIrKaLgoEA==chQIHtyPvuh2v5Hq");

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.exchange(
                NUTRITION_URL + "Tomato",
                HttpMethod.GET,
                new HttpEntity<>(headers),
                String.class);
    }
}