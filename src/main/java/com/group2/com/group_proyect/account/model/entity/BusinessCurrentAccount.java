package com.group2.com.group_proyect.account.model.entity;

import com.group2.com.group_proyect.customer.model.entity.BusinessCustomer;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class BusinessCurrentAccount extends Account {

    public BusinessCurrentAccount(Integer id, String number, Double balance, Integer commission, BusinessCustomer businessCustomer) {
        super(id, number, balance);
        this.commission = commission;
        this.businessCustomer = businessCustomer;
    }

    @Column(name = "commission", nullable = false, columnDefinition = "tinyint")
    private Integer commission; //comisión por mentenimiento

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "business_customer_id")
    private BusinessCustomer businessCustomer;

}
