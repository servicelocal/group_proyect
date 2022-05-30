package com.group2.com.group_proyect.creditcard.model.repository;

import com.group2.com.group_proyect.creditcard.model.entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {
}
