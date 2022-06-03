package com.group2.com.group_proyect.creditcard.service;

public class Transacts_CreditCardsServiceImpl {

	
	  
	    public void createTransact(Double amount, Boolean _typeTransact) {
	        if (_typeTransact) { //true=cargo, false = pago
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
