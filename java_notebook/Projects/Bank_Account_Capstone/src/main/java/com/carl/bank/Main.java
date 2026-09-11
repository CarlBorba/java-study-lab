package com.carl.bank;

import com.carl.bank.model.Account;
import com.carl.bank.repository.AccountRepository;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(1, "Carl", 1200);
        AccountRepository accountRepository = new AccountRepository(myAccount);
        accountRepository.save(myAccount);

        System.out.println(accountRepository.getAccountMap());
        accountRepository.toString(accountRepository.getAccountMap());
    }
}
