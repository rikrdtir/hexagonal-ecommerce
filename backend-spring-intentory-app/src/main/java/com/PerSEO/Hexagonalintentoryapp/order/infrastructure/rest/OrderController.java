package com.PerSEO.Hexagonalintentoryapp.order.infrastructure.rest;

import com.PerSEO.Hexagonalintentoryapp.order.application.OrderService;
import com.PerSEO.Hexagonalintentoryapp.order.domain.model.Order;
import com.PerSEO.Hexagonalintentoryapp.order.domain.model.OrderState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1_1/orders")
@Slf4j
public class OrderController {

    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping
    public ResponseEntity<Order> save(@RequestBody Order order){
        if (order.getOrderState().toString().equals(OrderState.CANCELLED.toString())){
            order.setOrderState(OrderState.CANCELLED);

        }else {
            order.setOrderState(OrderState.CONFIRMED);
        }

        return ResponseEntity.ok(orderService.save(order));
    }
    @PostMapping("/update/state/order")
    public ResponseEntity updateStateById(@RequestParam Integer id, @RequestParam String state){
        orderService.updateStateById(id,state);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<Iterable<Order>> finAll(){
        return ResponseEntity.ok(orderService.findAll());
    }
}