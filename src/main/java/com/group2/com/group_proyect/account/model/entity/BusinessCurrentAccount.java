package com.group2.com.group_proyect.account.model.entity;

import com.group2.com.group_proyect.customer.model.entity.BusinessCustomer;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BusinessCurrentAccount extends Account {

    @Column(name = "commission", nullable = false, columnDefinition = "tinyint")
    private Integer commission; //comisión por mentenimiento

    /*@Column(name = "signers", nullable = false)
    private Boolean signers; //0+ firmantes autorizados*/

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "business_customer_id")
    private BusinessCustomer businessCustomer;

}
