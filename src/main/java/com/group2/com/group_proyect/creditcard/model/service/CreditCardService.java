package com.group2.com.group_proyect.creditcard.model.service;



import com.group2.com.group_proyect.creditcard.model.entity.CreditCard;

import java.util.List;
import java.util.Optional;

public interface CreditCardService {

    public CreditCard saveCreditCard(CreditCard creditCard);

    public List<CreditCard> listAll();

    public Optional<CreditCard> creditCardId(Integer id);
    
    
}
