package com.group2.com.group_proyect.account.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Headline extends BusinessCurrentAccount {

    @Column(name = "titular", length = 30, nullable = false)
    private String titular; //1+ titulares

    @Column(name = "signers", nullable = false)
    private Boolean signers; //0+ firmantes autorizados

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "business_current_account_id")
    private BusinessCurrentAccount businessCurrentAccount;

}
