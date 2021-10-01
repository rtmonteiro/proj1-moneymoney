package com.pi.moneymoney.repository;

import java.util.List;

import com.pi.moneymoney.document.Transaction;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction,String>{

    @Query("{'idUser' : ?0, 'idGroup' : ?1}")
    List<Transaction> findByUserAndGroup(String idUser, String idGroup);
    
}
