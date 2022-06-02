package com.group2.com.group_proyect.account.model.service;


import com.group2.com.group_proyect.account.model.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    public Account saveAccount(Account account);

    public List<Account> listAll();

    public Optional<Account> accountId(Integer id);
    
    /*
    deposit()
    withdraw()
    */
}
