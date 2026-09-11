package com.carl.bank.model;

public record Trasaction(
        int transactionId,
        int fromId,
        int toId,
        double amount
        ) {}
