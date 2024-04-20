package com.PerSEO.Hexagonalintentoryapp.product.domain.ports;

import com.PerSEO.Hexagonalintentoryapp.product.domain.model.Product;

public interface IProductRepository {
    Product save(Product product);
    Iterable<Product> findAll();
    Product findById(Integer id);
    void deleteById(Integer id);
}
