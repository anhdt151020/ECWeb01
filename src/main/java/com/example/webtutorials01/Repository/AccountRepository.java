package com.example.webtutorials01.Repository;

import com.example.webtutorials01.Domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
