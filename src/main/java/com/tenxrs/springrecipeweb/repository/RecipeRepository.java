package com.tenxrs.springrecipeweb.repository;

import com.tenxrs.springrecipeweb.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
