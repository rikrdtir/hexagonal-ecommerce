package com.PerSEO.Hexagonalintentoryapp.product.infrastructure.config;

import com.PerSEO.Hexagonalintentoryapp.product.application.UserService;
import com.PerSEO.Hexagonalintentoryapp.product.domain.ports.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserService userService(IUserRepository iUserRepository ){
        return new UserService(iUserRepository);


    }


}
