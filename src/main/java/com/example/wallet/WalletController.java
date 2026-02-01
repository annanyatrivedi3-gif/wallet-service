package com.example.wallet;

import com.example.wallet.service.WalletService;
import com.example.wallet.service.WalletRequest;
import com.example.wallet.service.WalletBalanceResponse;

import java.util.UUID;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/wallet")
    public void operate(@RequestBody WalletRequest request) {
        walletService.applyOperation(
                request.walletId(),
                request.operationType(),
                request.amount()
        );
    }

    @GetMapping("/wallets/{id}")
    public WalletBalanceResponse balance(@PathVariable UUID id) {
        return new WalletBalanceResponse(
                id,
                walletService.getBalance(id)
        );
    }
}
