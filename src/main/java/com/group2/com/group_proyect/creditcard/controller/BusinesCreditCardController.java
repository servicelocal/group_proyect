package com.group2.com.group_proyect.creditcard.controller;

import com.group2.com.group_proyect.creditcard.model.entity.BusinessCreditCard;
import com.group2.com.group_proyect.creditcard.model.service.BusinessCreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/business_creditcard")
public class BusinesCreditCardController {

    @Autowired
    BusinessCreditCardService businessCreditCardService;

    @GetMapping("/{id}")
    public Optional<BusinessCreditCard> forId(@PathVariable("id") Integer id) {
        return businessCreditCardService.forId(id);
    }

    @GetMapping("/")
    public List<BusinessCreditCard> listAllBusiness() {
        return businessCreditCardService.list();
    }

    @PostMapping("/save")
    public BusinessCreditCard saveBusiness(@RequestBody BusinessCreditCard businessCreditCard) {
        return businessCreditCardService.save(businessCreditCard);
    }

    @PostMapping("/card_charge")
    public Boolean cardCharge(@RequestParam("amount") Double amount,
                              @RequestParam("id") Integer id) {
        return businessCreditCardService.cardCharge(amount, id);
    }

    @PostMapping("/pay_card")
    public Boolean payCard(@RequestParam("amount") Double amount,
                              @RequestParam("id") Integer id) {
        return businessCreditCardService.payCard(amount, id);
    }
}
