package org.emerald.springsecsection2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myAccount")
    public String myAccountDetails() {
        return "Here the account details from the DB";
    }
}
