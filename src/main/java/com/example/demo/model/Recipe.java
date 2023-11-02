package com.example.demo.model;

import java.util.List;

public class Recipe {

    public static final String TITLE = "title";

    public static final String INGREDIENTS = "ingredients";

    public static final String SERVINGS = "servings";

    public static final String INSTRUCTIONS = "instructions";

    public Recipe(String title, List<String> ingredients, String servings, String instructions) {
        this.title = title;
        this.ingredients = ingredients;
        this.servings = servings;
        this.instructions = instructions;
    }

    private String title;

    private final List<String> ingredients;

    private String servings;

    private String instructions;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getServings() {
        return servings;
    }

    public void setServings(String servings) {
        this.servings = servings;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
