package com.yjh.bandgroup.food_jpa.ingredientCategory.dto;


import com.yjh.bandgroup.food_jpa.common.IIdName;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IngredientCategoryDto implements IIdName {

    private Long id;
    private String name;

}
