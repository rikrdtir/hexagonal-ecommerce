package com.PerSEO.Hexagonalintentoryapp.product.domain.ports;

import com.PerSEO.Hexagonalintentoryapp.product.domain.model.Category;

public interface ICategoryRepository {
   Category save(Category category);
   Iterable<Category> findAll();
   Category findById(Integer id);
   void deleteById(Integer id);
}
