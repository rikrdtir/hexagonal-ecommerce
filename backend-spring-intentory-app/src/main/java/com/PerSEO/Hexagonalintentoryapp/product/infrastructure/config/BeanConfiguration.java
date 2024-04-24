package com.PerSEO.Hexagonalintentoryapp.product.infrastructure.config;

import com.PerSEO.Hexagonalintentoryapp.product.application.CategoryService;
import com.PerSEO.Hexagonalintentoryapp.product.application.ProductService;
import com.PerSEO.Hexagonalintentoryapp.product.application.UserService;
import com.PerSEO.Hexagonalintentoryapp.product.domain.ports.ICategoryRepository;
import com.PerSEO.Hexagonalintentoryapp.product.domain.ports.IProductRepository;
import com.PerSEO.Hexagonalintentoryapp.product.domain.ports.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserService userService(IUserRepository iUserRepository ){
        return new UserService(iUserRepository);
    }
    @Bean
    public CategoryService categoryService(ICategoryRepository iCategoryRepository){
        return new CategoryService(iCategoryRepository);
    }
    @Bean
    public ProductService productService(IProductRepository iProductRepository){
        return new ProductService(iProductRepository);
    }


}
