package com.pi.moneymoney.repository;

import com.pi.moneymoney.document.Transaction;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction,String>{
    
}
