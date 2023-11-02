package com.example.demo.service;

import com.example.demo.dao.RecipeDao;
import com.example.demo.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecipeService {

    @Autowired
    RecipeDao recipeDao;

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
