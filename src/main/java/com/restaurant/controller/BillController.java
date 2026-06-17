package com.restaurant.controller;

import org.springframework.web.bind.annotation.RestController;
import com.restaurant.service.BillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import com.restaurant.entity.Bill;



@RestController
@RequestMapping("/api/bills")
public class BillController 
{
    private final BillService billService;

    public BillController(BillService billService)
    {
        this.billService = billService;
    }

    @GetMapping("/{tableId}")
    public Bill generateBill(@PathVariable Integer tableId)
    {
        return billService.generateBill(tableId);
    }

    @PutMapping("/{id}/pay")
    public Bill payBill(@PathVariable Integer id)
    {
        return billService.payBill(id);
    }


}
