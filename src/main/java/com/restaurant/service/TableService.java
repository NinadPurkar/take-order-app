package com.restaurant.service;

import com.restaurant.entity.*;
import java.util.List;
import com.restaurant.util.TableManager;
import org.springframework.stereotype.Service;
import com.restaurant.dto.CustomerDTO;

@Service
public class TableService 
{
    private final CustomerService customerService;

    public TableService(CustomerService customerService)
    {
        this.customerService = customerService;
    }

    public List<Table> listTables()
    {
        return TableManager.getTables();
    }

    public Table assignCustomer(Integer tableId, CustomerDTO customerDTO)
    {
        Table table = TableManager.getTableById(tableId);
        if (table != null && "Available".equals(table.getStatus()))
        {
            Customer customer = customerService.createCustomer(customerDTO);
            table.setCustomer(customer);
            table.setStatus("Occupied");
            return table;
        }
        return null;
    }

    public Table freeTable(Integer tableId)
    {
        Table table = TableManager.getTableById(tableId);
        if (table != null && "Occupied".equals(table.getStatus()))
        {
            // table.getOrders().clear();
            table.setCustomer(null);
            table.setStatus("Available");
            return table;
        }
        return null;
    }
}
