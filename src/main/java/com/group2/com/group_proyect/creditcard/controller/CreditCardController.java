package com.group2.com.group_proyect.creditcard.controller;

import com.group2.com.group_proyect.creditcard.model.entity.CreditCard;
import com.group2.com.group_proyect.creditcard.model.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/credit_card")
public class CreditCardController {

    @Autowired
    CreditCardService creditCardService;

    @GetMapping("/{id}")
    public Optional<CreditCard> forId(@PathVariable("id") Integer id) {
        return creditCardService.forId(id);
    }

    @GetMapping()
    public List<CreditCard> list() {
        return creditCardService.list();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<Integer> saveCreditCard(@RequestBody CreditCard creditCard) {
        creditCardService.saveCreditCard(creditCard);
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }
}
