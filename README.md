# Wallet Service

## Description
This project implements a simple wallet service exposing REST APIs
for deposit, withdrawal, and balance retrieval.

The goal of this submission is to demonstrate backend design approach,
API structure, concurrency considerations, and infrastructure planning.

## API Endpoints
- POST /api/v1/wallet  
- GET /api/v1/wallets/{walletId}

## Intended Business Logic
- Wallet balance is stored in a PostgreSQL database
- Deposit increases balance
- Withdrawal decreases balance with insufficient funds validation

## Concurrency Strategy
To support high contention (e.g. 1000 RPS per wallet),
the intended approach is to use database-level transactions
with pessimistic row-level locking to prevent race conditions
and lost updates.

## Database & Migrations
- PostgreSQL is the target database
- Schema migrations are planned using Liquibase

## Local Execution Notes
Due to time constraints and local environment limitations,
database dependencies were excluded from local execution.
The focus of this submission is on design and system approach.

The full system is intended to be started using Docker Compose,
running both the application and PostgreSQL containers.

## Build & Run
```bash
./mvnw spring-boot:run
