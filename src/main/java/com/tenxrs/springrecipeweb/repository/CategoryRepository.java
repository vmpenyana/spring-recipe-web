package com.tenxrs.springrecipeweb.repository;

import com.tenxrs.springrecipeweb.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category , Long> {
}
