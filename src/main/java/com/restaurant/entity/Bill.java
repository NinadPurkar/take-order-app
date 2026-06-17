package com.restaurant.entity;

import java.util.List;

public class Bill 
{
    private Integer id;
    private Integer tableId;
    private List<Order> orders;
    private Double totalAmount;
    private String status;

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public Integer getTableId()
    {
        return tableId;
    }
    public void setTableId(Integer tableId)
    {
        this.tableId = tableId;
    }
    public List<Order> getOrders()
    {
        return orders;
    }
    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }
    public Double getTotalAmount()
    {
        return totalAmount;
    }
    public void setTotalAmount(Double totalAmount)
    {
        this.totalAmount = totalAmount;
    }
    public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
    
}
