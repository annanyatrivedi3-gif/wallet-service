package com.example.wallet.entity;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "wallet")
public class Wallet {

    @Id
    @Column(nullable = false)
    private UUID id;

    @Column(nullable = false)
    private BigDecimal balance;

    @Version
    private Long version; // optimistic locking

    public Wallet() {}

    public Wallet(UUID id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public UUID getId() { return id; }
    public BigDecimal getBalance() { return balance; }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
