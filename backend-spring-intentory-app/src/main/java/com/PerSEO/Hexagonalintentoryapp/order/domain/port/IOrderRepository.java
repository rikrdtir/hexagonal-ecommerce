package com.PerSEO.Hexagonalintentoryapp.order.domain.port;

import com.PerSEO.Hexagonalintentoryapp.order.domain.model.Order;

public interface IOrderRepository {
    Order save(Order order);
    Order findById(Integer id);
    Iterable<Order> findAll();
    Iterable<Order> findByUserId(Integer userId);
    void updateStateById(Integer id, String state);
    
}
