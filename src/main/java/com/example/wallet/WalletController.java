package com.example.wallet;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WalletController {

    @PostMapping("/wallet")
    public Map<String, Object> operate(@RequestBody Map<String, Object> request) {
        return Map.of(
                "walletId", request.get("walletId"),
                "status", "ACCEPTED"
        );
    }

    @GetMapping("/wallets/{id}")
    public Map<String, Object> balance(@PathVariable UUID id) {
        return Map.of(
                "walletId", id,
                "balance", BigDecimal.ZERO
        );
    }
}
