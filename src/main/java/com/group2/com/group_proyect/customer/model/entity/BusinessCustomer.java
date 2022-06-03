package com.group2.com.group_proyect.customer.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
//@PrimaryKeyJoinColumn(referencedColumnName = "bc_id")
public class BusinessCustomer extends Customer {

    @Column(name = "account", length = 10, nullable = false)
    private String account;

    /*@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<BusinessCurrentAccount> businessCurrentAccounts;*/

}
