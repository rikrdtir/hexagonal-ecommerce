package com.PerSEO.Hexagonalintentoryapp.product.infrastructure.adapters;

import com.PerSEO.Hexagonalintentoryapp.product.domain.model.Category;
import com.PerSEO.Hexagonalintentoryapp.product.domain.ports.ICategoryRepository;
import com.PerSEO.Hexagonalintentoryapp.product.infrastructure.mapper.CategoryMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryCrudRepositoryImpl implements ICategoryRepository {
    private final  ICategoryCrudRespository iCategoryCrudRespository;
    private final CategoryMapper categoryMapper;

    /// constructor
    public CategoryCrudRepositoryImpl(ICategoryCrudRespository iCategoryCrudRespository, CategoryMapper categoryMapper) {
        this.iCategoryCrudRespository = iCategoryCrudRespository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public Category save(Category category) {
        return categoryMapper.toCategory( iCategoryCrudRespository.save(categoryMapper.toCategoryEntity(category)));

    }

    @Override
    public Iterable<Category> findAll() {
        return categoryMapper.toCategoryList(iCategoryCrudRespository.findAll());
    }

    @Override
    public Category findById(Integer id) {

        return categoryMapper.toCategory( iCategoryCrudRespository.findById(id).orElseThrow(
                ()-> new RuntimeException("Categoría " +id+ "no encontrado")
        ));
    }

    @Override
    public void deleteById(Integer id) {
        iCategoryCrudRespository.findById(id).orElseThrow(
                ()-> new RuntimeException("Categoría " +id+ "no existe")
        );
        iCategoryCrudRespository.deleteById(id);
    }
}
