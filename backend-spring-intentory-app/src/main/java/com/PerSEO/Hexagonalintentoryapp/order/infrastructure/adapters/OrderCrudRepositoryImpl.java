package com.PerSEO.Hexagonalintentoryapp.order.infrastructure.adapters;

import com.PerSEO.Hexagonalintentoryapp.order.domain.model.Order;
import com.PerSEO.Hexagonalintentoryapp.order.domain.model.OrderState;
import com.PerSEO.Hexagonalintentoryapp.order.domain.port.IOrderRepository;
import com.PerSEO.Hexagonalintentoryapp.order.infrastructure.entity.OrderEntity;
import com.PerSEO.Hexagonalintentoryapp.order.infrastructure.mapper.IOrderMapper;
import com.PerSEO.Hexagonalintentoryapp.product.infrastructure.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public class OrderCrudRepositoryImpl implements IOrderRepository {
    private final IOrderMapper iOrderMapper;
    private final IOrderCrudRepository iOrderCrudRepository;

    public OrderCrudRepositoryImpl(IOrderMapper iOrderMapper, IOrderCrudRepository iOrderCrudRepository) {
        this.iOrderMapper = iOrderMapper;
        this.iOrderCrudRepository = iOrderCrudRepository;
    }

    @Override
    public Order save(Order order) {
        OrderEntity orderEntity = iOrderMapper.toOrderEntity(order);
        orderEntity.getOrderProducts().forEach(
                orderProductEntity -> orderProductEntity.setOrderEntity(orderEntity)
        );

        return iOrderMapper.toOrder( iOrderCrudRepository.save(orderEntity));
    }

    @Override
    public Order findById(Integer id) {
        return iOrderMapper.toOrder( iOrderCrudRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Orden con Id: "+ id +" no encontrada")
        ));
    }

    @Override
    public Iterable<Order> findAll() {
        return iOrderMapper.toOrderLis(iOrderCrudRepository.findAll());
    }

    @Override
    public Iterable<Order> findByUserId(Integer userId) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userId);

        return iOrderMapper.toOrderLis(iOrderCrudRepository.findByUserEntity(userEntity));
    }

    @Override
    public void updateStateById(Integer id, String state) {
        if (state.equals(OrderState.CANCELLED)) {
            iOrderCrudRepository.updateStateById(id, OrderState.CANCELLED);
            
        } else {
            iOrderCrudRepository.updateStateById(id, OrderState.CONFIRMED);
        }

    }
}
