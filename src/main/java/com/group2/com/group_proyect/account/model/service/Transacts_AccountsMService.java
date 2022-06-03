package com.group2.com.group_proyect.account.model.service;

public interface Transacts_AccountsMService {

    public Boolean toDepositBusinessCurrentAccount(Double amount, Integer id); //depósito

    public Boolean withdrawBusinessCurrentAccount(Double amount, Integer id); //retiro

}
