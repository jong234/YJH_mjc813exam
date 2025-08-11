package com.yjh.bandgroup.food_jpa.ingredient.dto;

import com.yjh.bandgroup.food_jpa.common.IIdName;

public interface IIngredient extends IIdName {
    Long getIngredientCategoryId();
    void setIngredientCategoryId(Long ingredientCategoryId);

    IIdName getIngredientCategory();
    void setIngredientCategory(IIdName ingredientCategory);

    default void copyMembersIngredient(IIngredient iIngredient) {
        if ( iIngredient == null) {
            return;
        }
        this.copyMembersIdName(iIngredient);
        this.setIngredientCategoryId(iIngredient.getIngredientCategoryId());
        this.setIngredientCategory(iIngredient.getIngredientCategory());
    }

    default void copyMembersIngredientNotNull(IIngredient iIngredient) {
        if ( iIngredient == null) {
            return;
        }
        iIngredient.copyMembersIdName(iIngredient);
        if ( iIngredient.getIngredientCategoryId() != null) {
            this.setIngredientCategoryId(iIngredient.getIngredientCategoryId());
        }
        if ( iIngredient.getIngredientCategory() != null) {
            this.setIngredientCategory(iIngredient.getIngredientCategory());
        }
    }
}
