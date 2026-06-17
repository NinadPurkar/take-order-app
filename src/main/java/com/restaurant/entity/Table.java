package com.restaurant.entity;

public class Table 
{

    private Integer id;
    private String status;
    private Customer customer;


    public Table(Integer id, String status, Customer customer)
    {
        this.id = id;
        this.status = status;
        this.customer = customer;
    } 
    //getters and setters

    public Integer getId()
    {
        return id;
    }
    
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
    public Customer getCustomer()
    {
        return customer;
    }
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }



}
