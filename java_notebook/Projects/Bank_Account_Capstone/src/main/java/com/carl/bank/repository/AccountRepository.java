package com.carl.bank.repository;

import com.carl.bank.model.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountRepository {
    private HashMap<Integer, Account> accountMap;

    public AccountRepository() {
        this.accountMap = new HashMap<>();
    }

    public Account save(Account account) {
        accountMap.putIfAbsent(account.getId(), account);
        return account;
    }

    public HashMap<Integer, Account> getAccountMap() {
        return accountMap;
    }

    public String toString(HashMap<Integer, Account> accountHashMap) {
        StringBuilder finalMsgBuilder = new StringBuilder();
        accountHashMap.forEach((id, account) -> finalMsgBuilder.append("Account ID: " + id + " Accounts Holder: " + account.getHolderName() + " balance: " + account.getBalance() + "\n"));

        return finalMsgBuilder.toString();
    }
}
