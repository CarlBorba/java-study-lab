package com.carl.bank;

import com.carl.bank.model.Account;
import com.carl.bank.repository.AccountRepository;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        AccountRepository accountRepository = new AccountRepository();

        Account myAccount = new Account(1, "Carl", new BigDecimal("1200.00"));
        accountRepository.save(myAccount);

        Account secondAccount = new Account(2, "John", new BigDecimal("1200.00"));
        accountRepository.save(secondAccount);

        System.out.println(accountRepository);
        System.out.println("################");

        accountRepository.findById(1).ifPresent(System.out::println);
    }
}