package com.example.macro.service;

import com.example.macro.dao.NutritionDao;
import com.example.macro.model.Nutrition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionService {

    @Autowired
    NutritionDao nutritionDao;

    public List<Nutrition> getNutritionValuesForItems(String food) {
        return nutritionDao.getNutritionValuesForItems(food);
    }
}
