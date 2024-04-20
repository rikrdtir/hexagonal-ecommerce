package com.PerSEO.Hexagonalintentoryapp.product.domain.ports;

import com.PerSEO.Hexagonalintentoryapp.product.domain.model.User;

public interface IUserRepository {
    User save(User user);
    Iterable<User> findAll();
    User findByEmail(String email);
    User findById(Integer id);
    void deleteById(Integer id);
}
