package com.restaurant.service;

import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Service;

import com.restaurant.dto.CustomerDTO;
import com.restaurant.entity.Customer;

@Service
public class CustomerService 
{
    private final AtomicInteger idGenerator = new AtomicInteger(1);

    public Customer createCustomer(CustomerDTO customerDTO)
    {
        Customer customer = new Customer();
        customer.setId(idGenerator.getAndIncrement());
        customer.setName(customerDTO.getName());
        customer.setPhone(customerDTO.getPhone());
        return customer;
    }

}
