package com.PerSEO.Hexagonalintentoryapp.order.infrastructure.adapters;

import com.PerSEO.Hexagonalintentoryapp.order.domain.model.OrderState;
import com.PerSEO.Hexagonalintentoryapp.order.infrastructure.entity.OrderEntity;
import com.PerSEO.Hexagonalintentoryapp.product.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface IOrderCrudRepository extends CrudRepository<OrderEntity, Integer>{
    @Transactional
    @Modifying
    @Query("UPDATE OrderEntity o SET o.state = :state WHERE o.id = :id")
    void updateStateById(Integer id, OrderState state);

    Iterable<OrderEntity> findByUserEntity(UserEntity userEntity);


}
