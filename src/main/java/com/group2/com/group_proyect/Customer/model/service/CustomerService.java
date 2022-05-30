package com.group2.com.group_proyect.Customer.model.service;

import com.group2.com.group_proyect.Customer.model.entity.Customer;
import com.group2.com.group_proyect.Customer.model.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    public Customer saveCustomer(Customer customer);

    public List<Customer> listAll();

    public Optional<Customer> customerId(Integer id);

}