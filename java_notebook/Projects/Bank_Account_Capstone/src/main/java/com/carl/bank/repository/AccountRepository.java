package com.carl.bank.repository;

import com.carl.bank.model.Account;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AccountRepository {
    private final Map<Integer, Account> accountMap;

    public AccountRepository() {
        this.accountMap = new HashMap<>();
    }

    public Account save(Account account) {
        accountMap.put(account.getId(), account);
        return account;
    }

    public Optional<Account> findById(int id) {
        return Optional.ofNullable(accountMap.get(id));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Account account : accountMap.values()) {
            sb.append(account).append(System.lineSeparator());
        }
        return sb.toString();
    }
}