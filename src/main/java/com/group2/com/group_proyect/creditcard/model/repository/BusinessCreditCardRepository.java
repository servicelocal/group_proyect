package com.group2.com.group_proyect.creditcard.model.repository;

import com.group2.com.group_proyect.creditcard.model.entity.BusinessCreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessCreditCardRepository extends JpaRepository<BusinessCreditCard,Integer> {
}
