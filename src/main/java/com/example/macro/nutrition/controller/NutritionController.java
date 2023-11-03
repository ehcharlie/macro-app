package com.example.macro.nutrition.controller;

import com.example.macro.nutrition.model.Nutrition;
import com.example.macro.nutrition.service.NutritionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nutrition-values")
public class NutritionController {

    private final NutritionService nutritionService;

    public NutritionController(NutritionService nutritionService) {
        this.nutritionService = nutritionService;
    }

    @GetMapping("/{food}")
    public List<Nutrition> getNutritionValuesforItems(@PathVariable String food) {
        return nutritionService.getNutritionValuesForItems(food);
    }
}