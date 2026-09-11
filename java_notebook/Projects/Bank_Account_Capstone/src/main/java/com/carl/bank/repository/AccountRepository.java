package com.carl.bank.repository;

import com.carl.bank.model.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountRepository {
    private Map<Integer, Account> accountMap;

    public AccountRepository(Account accountMap) {
        this.accountMap = new HashMap<>();
    }

    public Account save(Account account) {
        accountMap.putIfAbsent(account.getId(), account);
        return account;
    }

    public Map<Integer, Account> getAccountMap() {
        return accountMap;
    }

    public String toString(Map<Integer, Account> accountHashMap) {
        String finalMsg = "";
        accountHashMap.forEach((id, account) -> System.out.println("Account ID: " + id + " Accounts Holder: " + account.getHolderName() + " balance: " + account.getBalance()));

        return "teste";
    }
}
