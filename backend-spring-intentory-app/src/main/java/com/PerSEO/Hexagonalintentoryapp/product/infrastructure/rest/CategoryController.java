package com.PerSEO.Hexagonalintentoryapp.product.infrastructure.rest;

import com.PerSEO.Hexagonalintentoryapp.product.application.CategoryService;
import com.PerSEO.Hexagonalintentoryapp.product.domain.model.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Category> save(@RequestBody Category category){
        return new ResponseEntity<>(
                categoryService.save(category),
                HttpStatus.CREATED
        );
    }

    /**
     * Get all categories
     * @return
     */
    @GetMapping
    public ResponseEntity<Iterable<Category>> finAll(){
        return ResponseEntity.ok(categoryService.findAll());
    }

    /**
     * Find category by id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Integer id){
        return ResponseEntity.ok( categoryService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id){
        categoryService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
