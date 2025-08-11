package com.yjh.bandgroup.food_jpa.ingredientCategory.dto;

import com.yjh.bandgroup.food_jpa.common.IIdName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ingredientCategoryEntity")
@Table(name = "ingredient_category_tbl")
public class IngredientCategoryEntity implements IIdName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;
}
