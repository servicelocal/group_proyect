package com.group2.com.group_proyect.customer.model.service;

import com.group2.com.group_proyect.customer.model.entity.BusinessCustomer;

import java.util.List;

public interface BusinessCustomerService {

    public List<BusinessCustomer> list();

    public BusinessCustomer save(BusinessCustomer businessCustomer);

}
