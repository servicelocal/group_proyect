package com.group2.com.group_proyect.account.service;

import com.group2.com.group_proyect.account.model.entity.BusinessCurrentAccount;
import com.group2.com.group_proyect.account.model.repository.BusinessCurrentAccountRepository;
import com.group2.com.group_proyect.account.model.service.Transacts_AccountsMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Transacts_AccountService implements Transacts_AccountsMService {

    @Autowired
    BusinessCurrentAccountRepository businessCurrentAccountRepository;

    @Override
    public Boolean toDepositBusinessCurrentAccount(Double amount, Integer id) {
        BusinessCurrentAccount businessCurrentAccount = businessCurrentAccountRepository.findById(id).get();
        // actualizar el balance
        businessCurrentAccount.setBalance(amount);
        businessCurrentAccountRepository.save(businessCurrentAccount);
        return  true;
    }

    @Override
    public Boolean withdrawBusinessCurrentAccount(Double amount, Integer id) {
        BusinessCurrentAccount businessCurrentAccount = businessCurrentAccountRepository.findById(id).get();

        Double balance = businessCurrentAccount.getBalance();
        if (amount<=balance) {
            // actualizar el balance
            businessCurrentAccount.setBalance(balance-amount);
            businessCurrentAccountRepository.save(businessCurrentAccount);
            return true;
        } else {
            return false;
        }
    }
}
