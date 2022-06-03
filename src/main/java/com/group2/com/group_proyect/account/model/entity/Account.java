package com.group2.com.group_proyect.account.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "account")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "number", length = 8, nullable = false)
    private String number;

    @Column(name = "balance", nullable = false)
    private Double balance; //monto acumulado

    /*@ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;*/

}
