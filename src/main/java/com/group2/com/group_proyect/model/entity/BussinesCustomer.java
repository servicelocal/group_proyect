package com.group2.com.group_proyect.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
//@PrimaryKeyJoinColumn(referencedColumnName = "bc_id")
public class BussinesCustomer extends Customer {

    @Column(name = "account", length = 10, nullable = false)
    private String account;

}
