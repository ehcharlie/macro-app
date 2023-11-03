package com.example.macro.recipe.controller;

import com.example.macro.recipe.model.Recipe;
import com.example.macro.recipe.service.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/{recipe}")
    public List<Recipe> getRecipe(@PathVariable String recipe) {
        return recipeService.getRecipe(recipe);
    }
}