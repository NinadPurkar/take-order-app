package com.restaurant.controller;

import org.springframework.web.bind.annotation.RestController;

import com.restaurant.service.TableService;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import com.restaurant.entity.*;
import com.restaurant.dto.CustomerDTO;

@RestController
@RequestMapping("/api/tables")
public class TableController 
{
    private final TableService tableService;

    public TableController(TableService tableService)
    {
        this.tableService = tableService;
    }

    @GetMapping
    public List<Table> listTables()
    {
        return tableService.listTables();
    }

    @PostMapping("/{id}/assign")
    public Table assignCustomer(@PathVariable int id, @RequestBody CustomerDTO dto)
    {
        return tableService.assignCustomer(id, dto);
    }

    @PutMapping("/{id}/free")
    public Table FreeTable(@PathVariable int id)
    {
        return tableService.freeTable(id);
    }
    
}
