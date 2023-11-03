package com.example.macro.controller;

import com.example.macro.constant.ConstantsAndQueries;
import com.example.macro.model.Nutrition;
import com.example.macro.service.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/nutrition-values")
public class NutritionController {

    @Autowired
    NutritionService nutritionService;

    @GetMapping("/{food}")
    public List<Nutrition> getNutritionValuesforItems(@PathVariable String food) {
      return nutritionService.getNutritionValuesForItems(food);
}}