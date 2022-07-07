package com.example.webtutorials01.Service;

import com.example.webtutorials01.Domain.Account;
import com.example.webtutorials01.Repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class AccountService {


    private final Logger log = LoggerFactory.getLogger(AccountService.class);
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional()
    public Page<Account> findAll(Pageable pageable) {
        log.debug("Request to get all Account");
        return accountRepository.findAll(pageable);
    }

}
