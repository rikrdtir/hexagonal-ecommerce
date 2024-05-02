package com.PerSEO.Hexagonalintentoryapp.order.application;

import com.PerSEO.Hexagonalintentoryapp.order.domain.model.Order;
import com.PerSEO.Hexagonalintentoryapp.order.domain.port.IOrderRepository;

public class OrderService {
    private final IOrderRepository iOrderRepository;

    public OrderService(IOrderRepository iOrderRepository) {
        this.iOrderRepository = iOrderRepository;
    }

    /**
     * Create order
     * @param order
     * @return
     */
    public Order save(Order order){
        return this.iOrderRepository.save(order);
    }

    /**
     * Find all orders
     * @return
     */

    public Iterable<Order> findAll(){
        return this.iOrderRepository.findAll();
    }

    /**
     * Find order by id
     * @param userId
     * @return
     */
    public Iterable<Order> findByUserId(Integer userId){
        return this.iOrderRepository.findByUserId(userId);
    }

    /**
     * Update state order
     * @param id
     * @param state
     */
    public void updateStateById(Integer id, String state){
        this.iOrderRepository.updateStateById(id, state);
    }


}
