package com.group2.com.group_proyect.Customer.model.controller;


import com.group2.com.group_proyect.Customer.model.entity.Customer;
import com.group2.com.group_proyect.Customer.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/listCustomer")
//    @RequestMapping(value = "/listCustomer", method = RequestMethod.GET)
    public List<Customer> listAll() {
        return customerService.listAll();
    }

    @RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
    public ResponseEntity<Integer> saveCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

    @RequestMapping(value = "/customerId", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Integer> customerId(@RequestParam("id") Integer id) {
        Optional<Customer> customerRepository = customerService.customerId(id);
        if (customerRepository.isPresent()) {
            customerService.customerId(id);
            return new ResponseEntity<Integer>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Integer>(HttpStatus.NOT_FOUND);
        }
    }

}
