package com.group2.com.group_proyect.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
//@PrimaryKeyJoinColumn(name = "pc_id")
public class PersonalCustomer extends Customer {

    @Column(name = "account", length = 10, nullable = false)
    private String account;
}
