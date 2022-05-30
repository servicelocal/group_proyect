package com.group2.com.group_proyect.creditcard.model.entity;

import com.group2.com.group_proyect.customer.model.entity.BusinessCustomer;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BusinessCreditCard extends CreditCard {

    @Column(name = "account", length = 10, nullable = false)
    private String account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buiness_customer_id")
    private BusinessCustomer businessCustomer;

}
