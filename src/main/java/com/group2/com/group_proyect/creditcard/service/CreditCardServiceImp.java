package com.group2.com.group_proyect.creditcard.service;

import com.group2.com.group_proyect.creditcard.model.entity.CreditCard;
import com.group2.com.group_proyect.creditcard.model.repository.CreditCardRepository;
import com.group2.com.group_proyect.creditcard.model.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreditCardServiceImp implements CreditCardService {

    @Autowired
    CreditCardRepository creditCardRepository;

    @Override
    public CreditCard saveCreditCard(CreditCard creditCard) {
        return creditCardRepository.save(creditCard);
    }

    @Override
    public List<CreditCard> listAll() {
        return creditCardRepository.findAll();
    }

    @Override
    public Optional<CreditCard> creditCardId(Integer id) {
        return creditCardRepository.findById(id);
    }
}
