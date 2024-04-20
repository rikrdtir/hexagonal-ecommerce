package com.PerSEO.Hexagonalintentoryapp.product.infrastructure.adapters;

import com.PerSEO.Hexagonalintentoryapp.product.domain.model.User;
import com.PerSEO.Hexagonalintentoryapp.product.domain.ports.IUserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserCrudRepositoryImpl implements IUserRepository {
    private final IUserRepository iUserRepository;

    public UserCrudRepositoryImpl(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
