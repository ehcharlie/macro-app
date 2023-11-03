package com.example.macro.nutrition.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrition {

    private String name;

    private String calories;

    @JsonProperty("serving_size_g")
    private String servingSize;

    @JsonProperty("fat_total_g")
    private String totalFat;

    @JsonProperty("fat_saturated_g")
    private String saturatedFat;

    @JsonProperty("protein_g")
    private String protein;

    @JsonProperty("sodium_mg")
    private String sodium;

    @JsonProperty("potassium_mg")
    private String potassium;

    @JsonProperty("cholesterol_mg")
    private String cholesterol;

    @JsonProperty("carbohydrates_total_g")
    private String carbohydrates;

    @JsonProperty("fiber_g")
    private String fiber;

    @JsonProperty("sugar_g")
    private String sugar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getServingSize() {
        return servingSize;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public String getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(String totalFat) {
        this.totalFat = totalFat;
    }

    public String getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(String saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getSodium() {
        return sodium;
    }

    public void setSodium(String sodium) {
        this.sodium = sodium;
    }

    public String getPotassium() {
        return potassium;
    }

    public void setPotassium(String potassium) {
        this.potassium = potassium;
    }

    public String getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(String cholesterol) {
        this.cholesterol = cholesterol;
    }

    public String getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(String carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public String getFiber() {
        return fiber;
    }

    public void setFiber(String fiber) {
        this.fiber = fiber;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }
}
