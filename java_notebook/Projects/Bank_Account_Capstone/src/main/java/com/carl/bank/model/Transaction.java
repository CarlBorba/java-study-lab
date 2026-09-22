package com.carl.bank.model;

import java.math.BigDecimal;

public record Transaction(
        int transactionId,
        int fromId,
        int toId,
        BigDecimal amount
) {}