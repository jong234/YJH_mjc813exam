package com.yjh.bandgroup.food_jpa.food.service;

import com.yjh.bandgroup.food_jpa.food.dto.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository  extends JpaRepository<FoodEntity, Long> {

}
