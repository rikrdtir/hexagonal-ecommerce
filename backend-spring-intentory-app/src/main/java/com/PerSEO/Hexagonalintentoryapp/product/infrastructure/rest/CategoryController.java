package com.PerSEO.Hexagonalintentoryapp.product.infrastructure.rest;

import com.PerSEO.Hexagonalintentoryapp.product.application.CategoryService;
import com.PerSEO.Hexagonalintentoryapp.product.domain.model.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1_1/admin/categories")
@Slf4j
public class CategoryController {
    private final CategoryService categoryService;

    //constructor
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    /**
     * Save catetory
     * @param category
     * @return
     */
    @PostMapping
    public Category save(@RequestBody Category category){
        return categoryService.save(category);
    }

    /**
     * Get all categories
     * @return
     */
    @GetMapping
    public Iterable<Category> finAll(){
        return categoryService.findAll();
    }

    /**
     * Find category by id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Category findById(@PathVariable Integer id){
        return categoryService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        categoryService.deleteById(id);
    }

}
