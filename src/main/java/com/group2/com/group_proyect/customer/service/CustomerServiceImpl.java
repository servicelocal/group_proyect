package com.group2.com.group_proyect.customer.service;

import com.group2.com.group_proyect.customer.model.entity.Customer;
import com.group2.com.group_proyect.customer.model.repository.CustomerRepository;
import com.group2.com.group_proyect.customer.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {
        return  customerRepository.save(customer);
    }

    @Override
    public List<Customer> listAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> customerId(Integer id) {
        return customerRepository.findById(id);
    }
}