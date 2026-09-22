package com.carl.bank.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private final int id;
    private String holderName;
    private BigDecimal balance;

    public Account(int id, String holderName, BigDecimal balance) {
        this.id = id;
        this.holderName = holderName;
        this.balance = balance != null ? balance : BigDecimal.ZERO;
    }

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

    public BigDecimal moneyTransferIncome(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Income amount must be greater than zero.");
        }
        balance = balance.add(amount);
        return balance;
    }

    public BigDecimal moneyTransferOutcome(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Outcome amount must be greater than zero.");
        }
        if (amount.compareTo(balance) > 0) {
            throw new IllegalStateException("Insufficient funds. Transfer amount exceeds balance.");
        }
        balance = balance.subtract(amount);
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
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
        return "Account ID: " + id + ", Holder: " + holderName + ", Balance: " + balance;
    }
}