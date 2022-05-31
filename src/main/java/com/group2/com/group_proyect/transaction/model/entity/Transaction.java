package com.group2.com.group_proyect.transaction.model.entity;

import com.group2.com.group_proyect.account.model.entity.Account;
import lombok.Data;

import javax.persistence.*;

/*@Entity
@Table(name = "transaction")
@Data
@Inheritance(strategy = InheritanceType.JOINED)*/
public class Transaction {
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "amount", nullable = false)
    private Double amount;*/

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;*/

    //funcion createTransaction(Double amount)
    public void createTransact(Double amount, Boolean typeTransact) {}
}
