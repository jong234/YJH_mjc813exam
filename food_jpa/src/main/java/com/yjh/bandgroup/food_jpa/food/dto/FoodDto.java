package com.yjh.bandgroup.food_jpa.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FoodDto  {

    private Long id;
    private String name;
    private Integer spicyLevel;
    private Integer sweetLevel;
    private Integer sourLevel;
    private Integer saltyLevel;
    private Long ingredient_id;
    private Long food_category_id;



}
