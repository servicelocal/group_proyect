package com.group2.com.group_proyect.customer.model.service;

import com.group2.com.group_proyect.customer.model.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    public Customer saveCustomer(Customer customer);

    public List<Customer> listAll();

    public Optional<Customer> customerId(Integer id);

}
