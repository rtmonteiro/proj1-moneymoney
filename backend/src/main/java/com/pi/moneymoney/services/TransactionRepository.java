package com.pi.moneymoney.services;

import java.util.List;

import com.pi.moneymoney.document.Transaction;

import org.springframework.beans.factory.annotation.Autowired;

public class TransactionRepository implements Service<Transaction>{
    @Autowired
    TransactionRepository rp;

    @Override
    public List<Transaction> findAll() {
        return rp.findAll();
    }

    @Override
    public Transaction findById(Integer id) {
        return rp.findById(id);
    }

    @Override
    public Transaction save(Transaction objecT) {
        return rp.save(objecT);
    }
}
