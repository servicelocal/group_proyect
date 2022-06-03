package com.group2.com.group_proyect.account.controller;

import com.group2.com.group_proyect.account.model.entity.Account;
import com.group2.com.group_proyect.account.model.entity.BusinessCurrentAccount;
import com.group2.com.group_proyect.account.model.service.BusinessCurrentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/business_current")
public class BusinessCurrentAccountController {

    @Autowired
    BusinessCurrentAccountService businessCurrentAccountService;

    @GetMapping("/id/{id}")
    public Optional<BusinessCurrentAccount> forId(@PathVariable("id") Integer id) {
        return businessCurrentAccountService.forId(id);
    }

    @GetMapping("/")
    public List<BusinessCurrentAccount> listAll() {
        return businessCurrentAccountService.list();
    }

    @PostMapping("/save")
    public BusinessCurrentAccount save(@RequestBody BusinessCurrentAccount businessCurrentAccount) {
        return businessCurrentAccountService.save(businessCurrentAccount);
    }

    @PostMapping("/deposit")
    public Boolean toDeposit(@RequestParam("amount") Double amount,
                              @RequestParam("id") Integer id) {
        return businessCurrentAccountService.toDeposit(amount, id);
    }

    @PostMapping("/withdraw")
    public Boolean withdraw(@RequestParam("amount") Double amount,
                           @RequestParam("id") Integer id) {
        return businessCurrentAccountService.withdraw(amount, id);
    }

}
