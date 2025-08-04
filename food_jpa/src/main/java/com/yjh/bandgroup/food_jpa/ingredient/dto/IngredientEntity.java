package com.yjh.bandgroup.food_jpa.ingredient.dto;

import com.yjh.bandgroup.food_jpa.ingredientCategory.dto.IngredientCategoryEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ingredientEntity")
@Table(name = "ingredient_tbl")
public class IngredientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @ManyToOne
    @JoinColumn(name = "ingredient_category_id")
    private IngredientCategoryEntity ingredient_category_id;

}
