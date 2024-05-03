package com.PerSEO.Hexagonalintentoryapp.product.infrastructure.adapters;

import com.PerSEO.Hexagonalintentoryapp.product.domain.model.Product;
import com.PerSEO.Hexagonalintentoryapp.product.domain.ports.IProductRepository;

import com.PerSEO.Hexagonalintentoryapp.product.infrastructure.mapper.IProductMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ProductCrudRepositoryImpl implements IProductRepository {
    private final IProductCrudRepository iProductCrudRepository;
    private final IProductMapper productMaper;

    // constructor
    public ProductCrudRepositoryImpl(IProductCrudRepository iProductCrudRepository, IProductMapper productMaper) {
        this.iProductCrudRepository = iProductCrudRepository;
        this.productMaper = productMaper;
    }


    /**
     * Save product
     * @param product
     * @return
     */
    @Override
    public Product save(Product product) {
        return productMaper.toProduct( iProductCrudRepository.save(productMaper.toProductEntity(product)));
    }

    /**
     * Fin all products
     * @return
     */
    @Override
    public Iterable<Product> findAll() {
        return productMaper.toProductList(iProductCrudRepository.findAll());
    }

    /**
     * Find product by id
     * @param id
     * @return
     */
    @Override
    public Product findById(Integer id) {
        return productMaper.toProduct(iProductCrudRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Producto " +id+ "no encontrado")
        ));
    }

    @Override
    public void deleteById(Integer id) {
        iProductCrudRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Producto "+id+"no existe")
        );
        iProductCrudRepository.deleteById(id);

    }
}
