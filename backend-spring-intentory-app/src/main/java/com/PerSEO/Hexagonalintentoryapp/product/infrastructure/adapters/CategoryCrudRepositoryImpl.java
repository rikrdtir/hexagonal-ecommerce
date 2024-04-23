package com.PerSEO.Hexagonalintentoryapp.product.infrastructure.adapters;

import com.PerSEO.Hexagonalintentoryapp.product.domain.model.Category;
import com.PerSEO.Hexagonalintentoryapp.product.domain.ports.ICategoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryCrudRepositoryImpl implements ICategoryRepository {
    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public Iterable<Category> findAll() {
        return null;
    }

    @Override
    public Category findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
