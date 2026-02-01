package com.example.wallet.service;

import java.math.BigDecimal;
import java.util.UUID;

public record WalletBalanceResponse(
        UUID walletId,
        BigDecimal balance
) {}
