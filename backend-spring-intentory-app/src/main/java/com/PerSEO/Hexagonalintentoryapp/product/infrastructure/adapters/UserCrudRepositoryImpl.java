package com.PerSEO.Hexagonalintentoryapp.product.infrastructure.adapters;

import com.PerSEO.Hexagonalintentoryapp.product.domain.model.User;
import com.PerSEO.Hexagonalintentoryapp.product.domain.ports.IUserRepository;
import com.PerSEO.Hexagonalintentoryapp.product.infrastructure.mapper.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserCrudRepositoryImpl implements IUserRepository {
    private final IUserCrudRepository iUserCrudRepository;
    private final UserMapper userMapper;

    public UserCrudRepositoryImpl(IUserCrudRepository iUserCrudRepository, UserMapper userMapper) {
        this.iUserCrudRepository = iUserCrudRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User save(User user) {
        return userMapper.toUser( iUserCrudRepository.save( userMapper.toUserEntity(user) ));
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
        return userMapper.toUser(iUserCrudRepository.findById(id).get());
    }

    @Override
    public void deleteById(Integer id) {

    }
}
