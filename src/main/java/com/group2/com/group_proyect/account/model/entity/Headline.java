package com.group2.com.group_proyect.account.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Headline extends BusinessCurrentAccount {
    //1+ titulares
    private String titular;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "business_current_account_id")
    private BusinessCurrentAccount businessCurrentAccount;

}
