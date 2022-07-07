package com.example.webtutorials01.Controller;

import com.example.webtutorials01.Service.AccountService;

public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


}
