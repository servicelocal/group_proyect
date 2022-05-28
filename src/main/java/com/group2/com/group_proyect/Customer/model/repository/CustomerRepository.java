package com.group2.com.group_proyect.Customer.model.repository;

import com.group2.com.group_proyect.Customer.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
