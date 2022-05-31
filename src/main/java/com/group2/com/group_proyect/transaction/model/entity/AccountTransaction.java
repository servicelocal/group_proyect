package com.group2.com.group_proyect.transaction.model.entity;

import lombok.Data;

import javax.persistence.Entity;


/*@Entity
@Data*/
public class AccountTransaction extends Transaction {

    //private Boolean typeTransaction; // Verdadero: deposito, Falso: Retiro

    @Override
    public void createTransact(Double amount, Boolean typeTransact) {
        if (typeTransact) {
            this.toDeposit(amount);
        } else {
            this.withdraw(amount);
        }
    }

    public Boolean toDeposit(Double amount) { //depósito
        return true;
    }

    public Boolean withdraw(Double amount){ //retiro
        return true;
    }

}
