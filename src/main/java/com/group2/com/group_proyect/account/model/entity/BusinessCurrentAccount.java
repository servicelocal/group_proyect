package com.group2.com.group_proyect.account.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class BusinessCurrentAccount extends Account {

    @Column(name = "description", length = 20)
    private String description;

}
