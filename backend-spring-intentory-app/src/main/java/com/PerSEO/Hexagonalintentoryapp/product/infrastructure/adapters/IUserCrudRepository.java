package com.PerSEO.Hexagonalintentoryapp.product.infrastructure.adapters;

import com.PerSEO.Hexagonalintentoryapp.product.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserCrudRepository extends CrudRepository<UserEntity, Integer> {
}
