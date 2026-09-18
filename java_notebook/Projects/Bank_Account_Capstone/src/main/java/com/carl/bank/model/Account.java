package com.carl.bank.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private final int id;
    private String holderName;
    private BigDecimal balance;

    // CONSTRUCTOR
    public Account(int id, String holderName, BigDecimal balance) {
        this.id = id;
        this.holderName = holderName;
        this.balance = balance;
    }

    // GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    // Balance
    public BigDecimal moneyTransferIncome(int value) {
        BigDecimal bigValue = new BigDecimal(value);
        balance = balance.add(bigValue);
        return balance;
    }

    public BigDecimal moneyTransferOutcome(int value) {
        BigDecimal bigValue = new BigDecimal(value);
        balance = balance.subtract(bigValue);
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Account ID: " + id + " Accounts Holder: " + holderName + " balance: " + balance;
    }}
