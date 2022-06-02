package com.group2.com.group_proyect.creditcard.model.entity;

import com.group2.com.group_proyect.account.model.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "credit_card")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "number", length = 16, nullable = false)
    private String number;

    @Column(name = "pin", length = 4, nullable = false)
    private String pin;

    @Column(name = "limit_credit", nullable = false) //700, 
    private Integer limitCredit; //limite de crédito

    @Column(name = "remaining_credit", nullable = false) //700, 
    private Double remainingCredit; //crédito restante
    
    /*id de cliente business, obtenido de BussinessClient Entity(ManyToOne)
     */
}
