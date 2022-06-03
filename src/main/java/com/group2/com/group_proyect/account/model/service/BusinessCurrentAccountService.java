package com.group2.com.group_proyect.account.model.service;

import com.group2.com.group_proyect.account.model.entity.BusinessCurrentAccount;

import java.util.List;
import java.util.Optional;

public interface BusinessCurrentAccountService {

    public Optional<BusinessCurrentAccount> forId(Integer id);

    public List<BusinessCurrentAccount> list();

    public BusinessCurrentAccount save(BusinessCurrentAccount businessCurrentAccount);

    public Boolean toDeposit(Double amount, Integer id); //depósito

    public Boolean withdraw(Double amount, Integer id); //retiro

}
