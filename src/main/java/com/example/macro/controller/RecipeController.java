package com.example.macro.controller;

import com.example.macro.service.RecipeService;
import com.example.macro.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping("/{recipe}")
    public List<Recipe> getRecipe(@PathVariable String recipe) {
        return recipeService.getRecipe(recipe);
    }
}