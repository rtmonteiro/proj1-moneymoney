package com.pi.moneymoney.services;

import java.util.List;

import com.pi.moneymoney.document.Transaction;
import com.pi.moneymoney.repository.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService implements Services<Transaction>{
    @Autowired
    TransactionRepository rp;

    @Override
    public List<Transaction> findAll() {
        return rp.findAll();
    }

    @Override
    public Transaction findById(String id) {
        Transaction transaction = null;
        try {
            transaction = rp.findById(id).get();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transaction;
    }

    @Override
    public Transaction save(Transaction objecT) {
        return rp.save(objecT);
    }

    public Transaction delete(String id){
        Transaction transaction = findById(id);
        rp.delete(transaction);
        return transaction;
    }
}
