package com.group2.com.group_proyect.account.model.entity;

import com.group2.com.group_proyect.customer.model.entity.PersonalCustomer;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PersonalCurrentAccount extends Account {

    @Column(name = "commission", nullable = false, columnDefinition = "tinyint")
    private Integer commission; //comisión por mentenimiento

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_customer_id")
    private PersonalCustomer personalCustomer;

}
