package com.carl.bank;

import com.carl.bank.model.Account;
import com.carl.bank.repository.AccountRepository;

public class Main {
    public static void main(String[] args) {
        AccountRepository accountRepository = new AccountRepository();


        Account myAccount = new Account(1, "Carl", 1200);
        accountRepository.save(myAccount);

        Account secondAccount = new Account(2, "Jhon", 1200);
        accountRepository.save(secondAccount);

        System.out.println(accountRepository);
        System.out.println("################");

        System.out.println(accountRepository.findById(1));
    }
}
