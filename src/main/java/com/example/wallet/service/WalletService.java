package com.example.wallet.service;

import java.math.BigDecimal;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    public void applyOperation(UUID walletId, OperationType type, BigDecimal amount) {
        // TODO: implement DB logic
    }

    public BigDecimal getBalance(UUID walletId) {
        return BigDecimal.ZERO;
    }
}
