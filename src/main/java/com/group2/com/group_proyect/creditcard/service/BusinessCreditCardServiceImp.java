package com.group2.com.group_proyect.creditcard.service;

import com.group2.com.group_proyect.creditcard.model.entity.BusinessCreditCard;
import com.group2.com.group_proyect.creditcard.model.repository.BusinessCreditCardRepository;
import com.group2.com.group_proyect.creditcard.model.service.BusinessCreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessCreditCardServiceImp implements BusinessCreditCardService {

    @Autowired
    BusinessCreditCardRepository businessCreditCardRepository;

    @Override
    public Optional<BusinessCreditCard> forId(Integer id) {
        return businessCreditCardRepository.findById(id);
    }

    @Override
    public List<BusinessCreditCard> list() {
        return businessCreditCardRepository.findAll();
    }

    @Override
    public BusinessCreditCard save(BusinessCreditCard businessCreditCard) {
        return businessCreditCardRepository.save(businessCreditCard);
    }

    @Override
    public Boolean cardCharge(Double amount, Integer id) {
        BusinessCreditCard businessCreditCard = businessCreditCardRepository.findById(id).get();

        Double remaining = businessCreditCard.getRemainingCredit();
        if (amount<=remaining) {
            // Actualiza el monto restante en CreditCard
            remaining = remaining - amount;
            businessCreditCard.setRemainingCredit(remaining);
            this.save(businessCreditCard);
            return true;

        } else {
            return false;
        }
    }

    @Override
    public Boolean payCard(Double amount, Integer id) {
        BusinessCreditCard businessCreditCard = businessCreditCardRepository.findById(id).get();

        Double remaining = businessCreditCard.getRemainingCredit();
        Integer limit = businessCreditCard.getLimitCredit();
        if (amount<=(limit-remaining)) {
            // Actualiza el monto restante en CreditCard
            remaining = remaining + amount;
            businessCreditCard.setRemainingCredit(remaining);
            this.save(businessCreditCard);
            return true;

        } else {
            return false;
        }
    }

    /*@Override
    public Boolean payCard(Double amount) {
        return false;
    }*/

}
