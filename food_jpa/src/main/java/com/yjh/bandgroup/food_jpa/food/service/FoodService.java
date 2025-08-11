package com.yjh.bandgroup.food_jpa.food.service;

import com.yjh.bandgroup.food_jpa.food.dto.FoodDto;
import com.yjh.bandgroup.food_jpa.food.dto.FoodEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;

    public FoodEntity insert(FoodDto foodDto) {
        FoodEntity foodEntity = new FoodEntity();


        foodRepository.save(foodEntity);
        return foodEntity;
    }
}
