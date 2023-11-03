package com.example.macro.recipe.service;

import com.example.macro.recipe.dao.RecipeDao;
import com.example.macro.recipe.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecipeService {

    private final RecipeDao recipeDao;

    public RecipeService(RecipeDao recipeDao) {
        this.recipeDao = recipeDao;
    }

    public List<Recipe> getRecipe(String userRecipe) {
        List<Map<String, String>> recipes = recipeDao.getRecipes(userRecipe);

        if (!recipes.isEmpty()) {
            List<Recipe> recipeList = new ArrayList<>();

            recipes.forEach(recipe -> recipeList.add(new Recipe(
                    recipe.get(Recipe.TITLE),
                    new ArrayList<>(Arrays.asList(recipe.get(Recipe.INGREDIENTS).split("\\|"))),
                    recipe.get(Recipe.SERVINGS),
                    recipe.get(Recipe.INSTRUCTIONS))));

            return recipeList;
        }

        return Collections.emptyList();
    }
}
