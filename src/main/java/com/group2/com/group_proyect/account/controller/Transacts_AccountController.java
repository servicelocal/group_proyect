package com.group2.com.group_proyect.account.controller;

import com.group2.com.group_proyect.account.service.Transacts_AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a-transacts")
public class Transacts_AccountController {

    @Autowired
    Transacts_AccountService transacts_accountService;

    @PostMapping("/depositBCurrent")
    public Boolean toDeposit(@RequestParam("amount") Double amount,
                             @RequestParam("id") Integer id) {
        return transacts_accountService.toDepositBusinessCurrentAccount(amount, id);
    }

    @PostMapping("/withdrawBCurrent")
    public Boolean withdraw(@RequestParam("amount") Double amount,
                            @RequestParam("id") Integer id) {
        return transacts_accountService.withdrawBusinessCurrentAccount(amount, id);
    }

}
