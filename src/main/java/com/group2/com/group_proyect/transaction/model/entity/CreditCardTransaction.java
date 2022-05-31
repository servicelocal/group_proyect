package com.group2.com.group_proyect.transaction.model.entity;

import lombok.Data;

import javax.persistence.Entity;

/*@Entity
@Data*/
public class CreditCardTransaction extends Transaction {

    @Override
    public void createTransact(Double amount, Boolean typeTransact) {
        if (typeTransact) {
            this.cardCharge(amount);
        } else {
            this.payCard(amount);
        }
    }

    public Boolean cardCharge(Double amount) { //consumo
        return true;
    }

    public Boolean payCard(Double amount){ //pagos
        return true;
    }

}
