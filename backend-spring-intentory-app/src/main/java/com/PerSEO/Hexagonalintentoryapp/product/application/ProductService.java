package com.PerSEO.Hexagonalintentoryapp.product.application;

import com.PerSEO.Hexagonalintentoryapp.product.domain.model.Product;
import com.PerSEO.Hexagonalintentoryapp.product.domain.ports.IProductRepository;

public class ProductService {
    private final IProductRepository productRepository;

    // -- Constructor
    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }
     //// metods

    /**
     * Save product
     * @param product
     * @return
     */
    public Product save(Product product){
        return productRepository.save(product);
    }

    /**
     * Find all products
     * @return
     */
    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    /**
     * Find product by id
     * @param id
     * @return
     */
    public Product findById(Integer id){
        return productRepository.findById(id);
    }

    /**
     * Delete product by id
     * @param id
     */
    public void delteById(Integer id){
        productRepository.deleteById(id);
    }




}
