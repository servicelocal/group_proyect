package com.group2.com.group_proyect.creditcard.model.service;

import com.group2.com.group_proyect.creditcard.model.entity.BusinessCreditCard;

import java.util.List;
import java.util.Optional;

public interface BusinessCreditCardService {

    public Optional<BusinessCreditCard> forId(Integer id);

    public List<BusinessCreditCard> list();

    public BusinessCreditCard save(BusinessCreditCard businessCreditCard);

    public Boolean cardCharge(Double amount, Integer id); //consumo

    public Boolean payCard(Double amount, Integer id); //pagos

}
