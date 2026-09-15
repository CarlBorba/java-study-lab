package com.carl.bank.model;

import java.math.BigDecimal;

public record Trasaction(
        int transactionId,
        int fromId,
        int toId,
        BigDecimal amount
        ) {}
