package com.group2.com.group_proyect.account.controller;

import com.group2.com.group_proyect.account.model.entity.Account;
import com.group2.com.group_proyect.account.model.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/list")
    public List<Account> listAll() {
        return accountService.listAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<Integer> saveAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public Optional<Account> accountId(@PathVariable("id") Integer id) {
        return accountService.accountId(id);
    }
}
