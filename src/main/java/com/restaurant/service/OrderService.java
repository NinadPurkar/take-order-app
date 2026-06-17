package com.restaurant.service;

import com.restaurant.entity.MenuItem;
import com.restaurant.repository.MenuItemRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Service;
import com.restaurant.entity.Order;
import com.restaurant.entity.Table;
import com.restaurant.util.TableManager;

@Service
public class OrderService 
{
    private final MenuItemRepository menuItemRepository;

    private final Map<Integer,Order> orders = new HashMap<>();
    private final AtomicInteger orderIdGenerator = new AtomicInteger(1);
    
    public OrderService(MenuItemRepository menuItemRepository)
    {
        this.menuItemRepository = menuItemRepository;
    }

    public Order placeOrder(Integer tableId, List<Integer> menuItemIds)
    {
        Table table = TableManager.getTableById(tableId);
        if(table == null || "AVAILABLE".equals(table.getStatus()))
        {
            throw new IllegalStateException("Table is not occupied or does not exist.");
        }
        List<MenuItem> items = menuItemRepository.findAllById(menuItemIds);
        
        if (items.isEmpty())
        {
            throw new IllegalArgumentException("No valid menu items found for the provided IDs.");
        }

        Order order = new Order();
        
        order.setId(orderIdGenerator.getAndIncrement());

        order.setTableId(tableId);
        
        order.setItems(items);
        
        order.setStatus("PLACED");
        
        orders.put(order.getId(), order);
        
        return order;

    }

    public Order deliverOrder(Integer orderId)
    {
        Order order = orders.get(orderId);
        if (order != null)
        {
            order.setStatus("DELIVERED");
        }
        return order;
    }

    public List<Order> getOrdersByTableId(Integer tableId)
    {
        List<Order> result = new ArrayList<>();
        for (Order order : orders.values())
        {
            if (order.getTableId().equals(tableId))
            {
                result.add(order);
            }
        }
        return result;
    }

}
