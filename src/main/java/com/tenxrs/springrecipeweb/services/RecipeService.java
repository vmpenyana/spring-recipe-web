package com.tenxrs.springrecipeweb.services;

import com.tenxrs.springrecipeweb.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> findAll();
    Recipe save(Recipe recipe);
}
