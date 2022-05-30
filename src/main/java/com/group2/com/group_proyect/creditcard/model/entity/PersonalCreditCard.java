package com.group2.com.group_proyect.creditcard.model.entity;

import com.group2.com.group_proyect.customer.model.entity.PersonalCustomer;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PersonalCreditCard extends CreditCard {

    @Column(name = "account", length = 10, nullable = false)
    private String account;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_customer_id")
    private PersonalCustomer personalCustomer;

}
