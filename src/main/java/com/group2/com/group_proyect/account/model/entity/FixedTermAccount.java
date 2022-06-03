package com.group2.com.group_proyect.account.model.entity;

import com.group2.com.group_proyect.customer.model.entity.PersonalCustomer;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class FixedTermAccount extends Account {

    @Column(name = "day", length = 2, nullable = false, columnDefinition = "tinyint")
    private Integer day; //retiro o depósito en una dia específico del mes

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_customer_id")
    private PersonalCustomer personalCustomer;

}
