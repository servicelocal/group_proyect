package com.group2.com.group_proyect.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "bussines_customer")
@Data
public class BussinesCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "account", length = 10, nullable = false)
    private String account;

}
