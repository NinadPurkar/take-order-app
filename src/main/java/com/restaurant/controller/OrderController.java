package com.restaurant.controller;


import org.springframework.web.bind.annotation.*;
import com.restaurant.service.OrderService;

import java.util.List;
import com.restaurant.entity.Order;



@RestController
@RequestMapping("/api/orders")
public class OrderController 
{

    private final OrderService orderService;

    public OrderController(OrderService orderService)
    {
        this.orderService = orderService;
    }

    @PostMapping
    public Order placeOrder(@RequestParam Integer tableId, @RequestBody List<Integer> menuItemIds)
    {
        return orderService.placeOrder(tableId, menuItemIds);
    }

    @PutMapping("/{id}/deliver")
    public Order deliverOrder(@PathVariable Integer id)
    {
        return orderService.deliverOrder(id);
    }

    @GetMapping("/{tableId}")
    public List<Order> getOrdersByTableId(@PathVariable Integer tableId)
    {
        return orderService.getOrdersByTableId(tableId);
    }
}
