package com.example.macro.model;

public class Nutrition {

    public Nutrition() {
    }

    public Nutrition(
            String name,
            String calories,
            String serving_size_g,
            String fat_total_g,
            String fat_saturated_g,
            String protein_g,
            String sodium_mg,
            String potassium_mg,
            String cholesterol_mg,
            String carbohydrates_total_g,
            String fiber_g,
            String sugar_g) {
        this.name = name;
        this.calories = calories;
        this.serving_size_g = serving_size_g;
        this.fat_total_g = fat_total_g;
        this.fat_saturated_g = fat_saturated_g;
        this.protein_g = protein_g;
        this.sodium_mg = sodium_mg;
        this.potassium_mg = potassium_mg;
        this.cholesterol_mg = cholesterol_mg;
        this.carbohydrates_total_g = carbohydrates_total_g;
        this.fiber_g = fiber_g;
        this.sugar_g = sugar_g;
    }

    private String name;

    private String calories;

    private String serving_size_g;

    private String fat_total_g;

    private String fat_saturated_g;

    private String protein_g;

    private String sodium_mg;

    private String potassium_mg;

    private String cholesterol_mg;

    private String carbohydrates_total_g;

    private String fiber_g;

    private String sugar_g;

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

    public String getServing_size_g() {
        return serving_size_g;
    }

    public void setServing_size_g(String serving_size_g) {
        this.serving_size_g = serving_size_g;
    }

    public String getFat_total_g() {
        return fat_total_g;
    }

    public void setFat_total_g(String fat_total_g) {
        this.fat_total_g = fat_total_g;
    }

    public String getFat_saturated_g() {
        return fat_saturated_g;
    }

    public void setFat_saturated_g(String fat_saturated_g) {
        this.fat_saturated_g = fat_saturated_g;
    }

    public String getProtein_g() {
        return protein_g;
    }

    public void setProtein_g(String protein_g) {
        this.protein_g = protein_g;
    }

    public String getSodium_mg() {
        return sodium_mg;
    }

    public void setSodium_mg(String sodium_mg) {
        this.sodium_mg = sodium_mg;
    }

    public String getPotassium_mg() {
        return potassium_mg;
    }

    public void setPotassium_mg(String potassium_mg) {
        this.potassium_mg = potassium_mg;
    }

    public String getCholesterol_mg() {
        return cholesterol_mg;
    }

    public void setCholesterol_mg(String cholesterol_mg) {
        this.cholesterol_mg = cholesterol_mg;
    }

    public String getCarbohydrates_total_g() {
        return carbohydrates_total_g;
    }

    public void setCarbohydrates_total_g(String carbohydrates_total_g) {
        this.carbohydrates_total_g = carbohydrates_total_g;
    }

    public String getFiber_g() {
        return fiber_g;
    }

    public void setFiber_g(String fiber_g) {
        this.fiber_g = fiber_g;
    }

    public String getSugar_g() {
        return sugar_g;
    }

    public void setSugar_g(String sugar_g) {
        this.sugar_g = sugar_g;
    }
}
