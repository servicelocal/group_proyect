package com.group2.com.group_proyect.customer.controller;

import com.group2.com.group_proyect.customer.model.entity.BusinessCustomer;
import com.group2.com.group_proyect.customer.model.service.BusinessCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/business_customer")
public class BusinessCustomerController {

    @Autowired
    BusinessCustomerService businessCustomerService;

    @GetMapping()
    public List<BusinessCustomer> list() {
        return businessCustomerService.list();
    }

    @PostMapping("/save")
    public BusinessCustomer save(@RequestBody BusinessCustomer businessCustomer) {
        return businessCustomerService.save(businessCustomer);
    }

}
