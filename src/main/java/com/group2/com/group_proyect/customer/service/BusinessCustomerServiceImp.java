package com.group2.com.group_proyect.customer.service;

import com.group2.com.group_proyect.customer.model.entity.BusinessCustomer;
import com.group2.com.group_proyect.customer.model.repository.BusinessCustomerRepository;
import com.group2.com.group_proyect.customer.model.service.BusinessCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessCustomerServiceImp implements BusinessCustomerService {

    @Autowired
    BusinessCustomerRepository businessCustmerRepository;

    @Override
    public List<BusinessCustomer> list() {
        return businessCustmerRepository.findAll();
    }

    @Override
    public BusinessCustomer save(BusinessCustomer businessCustomer) {
        return businessCustmerRepository.save(businessCustomer);
    }
}
