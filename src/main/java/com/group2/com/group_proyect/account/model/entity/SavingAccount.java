package com.group2.com.group_proyect.account.model.entity;

import com.group2.com.group_proyect.customer.model.entity.PersonalCustomer;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SavingAccount extends Account {

    @Column(name = "max_num_movements", nullable = false, columnDefinition = "tinyint")
    private Integer maxNumMovements; //límite máximo de movimientos mensuales

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_customer_id")
    private PersonalCustomer personalCustomer;

}
