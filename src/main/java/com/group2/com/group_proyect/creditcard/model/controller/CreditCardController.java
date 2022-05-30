package com.group2.com.group_proyect.creditcard.model.controller;

import com.group2.com.group_proyect.creditcard.model.entity.CreditCard;
import com.group2.com.group_proyect.creditcard.model.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/creditcard")
public class CreditCardController {

    @Autowired
    CreditCardService creditCardService;

    @GetMapping()
    public List<CreditCard> listAll() {
        return creditCardService.listAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<Integer> saveCreditCard(@RequestBody CreditCard creditCard) {
        creditCardService.saveCreditCard(creditCard);
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public Optional<CreditCard> creditCardId(@PathVariable("id") Integer id) {
        return creditCardService.creditCardId(id);
    }

}
