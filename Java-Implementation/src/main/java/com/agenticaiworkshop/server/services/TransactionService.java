package com.agenticaiworkshop.server.services;

import com.agenticaiworkshop.server.repositories.TransactionsRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private final TransactionsRepository transactionsRepository;

    public TransactionService(TransactionsRepository transactionsRepository) {
        this.transactionsRepository = transactionsRepository;
    }
}
