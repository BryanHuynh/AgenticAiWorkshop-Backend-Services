package com.agenticaiworkshop.server.repositories;

import com.agenticaiworkshop.server.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer> {
}
