package com.group2.com.group_proyect.customer.model.entity;

import lombok.Data;

import javax.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
//@PrimaryKeyJoinColumn(referencedColumnName = "bc_id")
public class BusinessCustomer extends Customer {

    public BusinessCustomer(Integer id, String dni, String firstName, String lastName, String address, Date dateOfBirth, String email, String phone, String account) {
        super(id, dni, firstName, lastName, address, dateOfBirth, email, phone);
        this.account = account;
    }

    @Column(name = "account", length = 10, nullable = false)
    private String account;

    /*@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<BusinessCurrentAccount> businessCurrentAccounts;*/

}
