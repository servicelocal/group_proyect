package com.group2.com.group_proyect.creditcard.model.entity;

import com.group2.com.group_proyect.customer.model.entity.BusinessCustomer;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class BusinessCreditCard extends CreditCard {

    public BusinessCreditCard(Integer id, String number, String pin, Integer limitCredit, Double remainingCredit, String account, BusinessCustomer businessCustomer) {
        super(id, number, pin, limitCredit, remainingCredit);
        this.account = account;
        this.businessCustomer = businessCustomer;
    }

    @Column(name = "account", length = 10, nullable = false)
    private String account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "business_customer_id")
    private BusinessCustomer businessCustomer;

}
