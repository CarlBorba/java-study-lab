package com.carl.bank.repository;

import com.carl.bank.model.Account;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AccountRepository {
    private Map<Integer, Account> accountMap;

    public AccountRepository() {
        this.accountMap = new HashMap<>();
    }

    public Account save(Account account) {
        accountMap.putIfAbsent(account.getId(), account);
        return account;
    }

    public Optional<Account> findById(int id) {
        return Optional.ofNullable(accountMap.get(id));
    }

    @Override
    public String toString() {
        StringBuilder finalMsgBuilder = new StringBuilder();
        accountMap.forEach((id, account) -> finalMsgBuilder.append(account));

        return finalMsgBuilder.toString();
    }
}
