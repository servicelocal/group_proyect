package com.group2.com.group_proyect.customer.model.repository;

import com.group2.com.group_proyect.customer.model.entity.BusinessCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessCustomerRepository extends JpaRepository<BusinessCustomer, Integer> {
}
