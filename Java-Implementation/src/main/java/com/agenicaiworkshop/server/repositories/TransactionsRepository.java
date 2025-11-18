package com.agenicaiworkshop.server.repositories;

import com.agenicaiworkshop.server.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer> {
}
