package com.pi.moneymoney.repository;

import com.pi.moneymoney.document.Transaction;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction,Integer>{
    
}
