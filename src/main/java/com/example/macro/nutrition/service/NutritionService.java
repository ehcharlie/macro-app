package com.example.macro.nutrition.service;

import com.example.macro.nutrition.dao.NutritionDao;
import com.example.macro.nutrition.model.Nutrition;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionService {

    private final NutritionDao nutritionDao;

    public NutritionService(NutritionDao nutritionDao) {
        this.nutritionDao = nutritionDao;
    }

    public List<Nutrition> getNutritionValuesForItems(String food) {
        return nutritionDao.getNutritionValuesForItems(food);
    }
}
