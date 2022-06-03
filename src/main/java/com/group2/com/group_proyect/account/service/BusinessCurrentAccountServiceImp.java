package com.group2.com.group_proyect.account.service;

import com.group2.com.group_proyect.account.model.entity.BusinessCurrentAccount;
import com.group2.com.group_proyect.account.model.repository.BusinessCurrentAccountRepository;
import com.group2.com.group_proyect.account.model.service.BusinessCurrentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessCurrentAccountServiceImp implements BusinessCurrentAccountService {
    @Autowired
    BusinessCurrentAccountRepository businessCurrentAccountRepository;

    @Override
    public Optional<BusinessCurrentAccount> forId(Integer id) {
        return businessCurrentAccountRepository.findById(id);
    }

    @Override
    public List<BusinessCurrentAccount> list() {
        return businessCurrentAccountRepository.findAll();
    }

    @Override
    public BusinessCurrentAccount save(BusinessCurrentAccount businessCurrentAccount) {
        return businessCurrentAccountRepository.save(businessCurrentAccount);
    }

    @Override
    public Boolean toDeposit(Double amount, Integer id) {
        BusinessCurrentAccount businessCurrentAccount = businessCurrentAccountRepository.findById(id).get();
        // actualizar el balance
        businessCurrentAccount.setBalance(amount);
        this.save(businessCurrentAccount);
        return true;
    }

    @Override
    public Boolean withdraw(Double amount, Integer id) {
        BusinessCurrentAccount businessCurrentAccount = businessCurrentAccountRepository.findById(id).get();

        Double balance = businessCurrentAccount.getBalance();
        if (amount<=balance) {
            // actualizar el balance
            businessCurrentAccount.setBalance(balance-amount);
            this.save(businessCurrentAccount);
            return true;
        } else {
            return false;
        }
    }

}
