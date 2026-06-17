package com.restaurant.service;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.restaurant.entity.Bill;
import com.restaurant.entity.MenuItem;
import com.restaurant.entity.Order;
import java.util.List;
import java.util.Map;


@Service
public class BillService 
{
    private final OrderService orderService;
    private final TableService tableService;
    private final Map<Integer, Bill> bills = new HashMap<>();
    private final AtomicInteger billIdGenerator = new AtomicInteger(1);

    public BillService(OrderService orderService, TableService tableService)
    {
        this.orderService = orderService;
        this.tableService = tableService;
    }

    public Bill generateBill(Integer tableId)
    {
        List<Order> orders = orderService.getOrdersByTableId(tableId);

        double totalAmount = orders.stream()
                .flatMap(order -> order.getItems().stream())
                .mapToDouble(MenuItem::getPrice)
                .sum();
        Bill bill = new Bill();
        bill.setId(billIdGenerator.getAndIncrement());
        bill.setTableId(tableId);
        bill.setTotalAmount(totalAmount);
        bill.setStatus("UNPAID");
        bill.setOrders(orders);

        bills.put(bill.getId(),bill);
        return bill;
    }

    public Bill payBill(Integer billId)
    {
        Bill bill = bills.get(billId);
        if (bill != null)
        {
            bill.setStatus("PAID");
            //free table now

            tableService.freeTable(bill.getTableId());
        }
        return bill;
    }
}
