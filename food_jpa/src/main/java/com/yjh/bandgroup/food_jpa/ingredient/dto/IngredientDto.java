package com.yjh.bandgroup.food_jpa.ingredient.dto;

import com.yjh.bandgroup.food_jpa.common.IIdName;
import com.yjh.bandgroup.food_jpa.ingredientCategory.dto.IngredientCategoryDto;
import com.yjh.bandgroup.food_jpa.ingredientCategory.dto.IngredientCategoryDto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IngredientDto implements IIngredient {
    private Long id;
    private String name;
    private Long ingredientCategoryId;
    private IngredientCategoryDto ingredientCategoryDto;

    @Override
    public IIdName getIngredientCategory() {
        return this.ingredientCategoryDto;
    }

    @Override
    public void setIngredientCategory(IIdName ingredientCategory) {
        if( this.ingredientCategoryDto == null ) {
            this.ingredientCategoryDto = new IngredientCategoryDto();
        }
        this.ingredientCategoryDto.copyMembersIdName(ingredientCategory);
    }

    @Override
    public Long getIngredientCategoryId() {
        if (this.ingredientCategoryDto == null) {
            return this.ingredientCategoryId;
        }
        if (this.ingredientCategoryDto.getId() == null) {
            return this.ingredientCategoryId;
        }
        if (this.ingredientCategoryDto.getId() != this.ingredientCategoryId) {
            this.ingredientCategoryId = this.ingredientCategoryDto.getId();
        }
        return this.ingredientCategoryId;
    }

    @Override
    public void setIngredientCategoryId(Long ingredientCategoryId) {
        if (this.ingredientCategoryDto == null) {
            this.ingredientCategoryDto = new IngredientCategoryDto();
        }
        this.ingredientCategoryDto.setId(ingredientCategoryId);
        this.ingredientCategoryId = ingredientCategoryId;
    }
}
