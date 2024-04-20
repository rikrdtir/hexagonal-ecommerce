package com.PerSEO.Hexagonalintentoryapp.product.application;

import com.PerSEO.Hexagonalintentoryapp.product.domain.model.Category;
import com.PerSEO.Hexagonalintentoryapp.product.domain.ports.ICategoryRepository;

public class CategoryService {
    private final ICategoryRepository categoryRepository;

    // ---- Constructor
    public CategoryService(ICategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
    /// --- metods

    /**
     * @param category
     * @return
     */
    public Category save(Category category){
        return categoryRepository.save(category);
    }

    /**
     * FindAll
     * @return
     */
    public Iterable<Category> findAll(){
        return categoryRepository.findAll();
    }

    /**
     * FInd by Id
     * @param id
     * @return
     */
    public Category findById(Integer id){
        return categoryRepository.findById(id);
    }

    /**
     * Delete Category
     * @param id
     */
    public void deleteById(Integer id){
        categoryRepository.deleteById(id);
    }



}
