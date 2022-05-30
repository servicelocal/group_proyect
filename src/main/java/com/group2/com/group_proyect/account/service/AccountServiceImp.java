package com.group2.com.group_proyect.account.service;

import com.group2.com.group_proyect.account.model.entity.Account;
import com.group2.com.group_proyect.account.model.repository.AccountRepository;
import com.group2.com.group_proyect.account.model.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> listAll() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> accountId(Integer id) {
        return accountRepository.findById(id);
    }
}
