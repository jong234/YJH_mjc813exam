package com.yjh.bandgroup.food_jpa.food.dto;


import com.yjh.bandgroup.food_jpa.foodCategory.dto.FoodCategoryEntity;
import com.yjh.bandgroup.food_jpa.ingredient.dto.IngredientEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "foodEntity")
@Table(name = "food_tbl")
public class FoodEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 20)
    private String name;

    @Column(nullable = false)
    private Integer spicyLevel;

    @Column(nullable = false)
    private Integer sweetLevel;

    @Column(nullable = false)
    private Integer sourLevel;

    @Column(nullable = false)
    private Integer saltyLevel;

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private IngredientEntity ingredient_id;

    @ManyToOne
    @JoinColumn(name = "food_category_id")
    private FoodCategoryEntity food_category_id;
    
}
