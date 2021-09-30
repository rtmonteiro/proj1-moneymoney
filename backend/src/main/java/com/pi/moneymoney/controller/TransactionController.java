package com.pi.moneymoney.controller;

import java.util.List;

import com.pi.moneymoney.document.Transaction;
import com.pi.moneymoney.repository.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TransactionController {
    @Autowired
    TransactionRepository service;

    @GetMapping(value = "/transaction")
    public List<Transaction> getTransaction(){
        return service.findAll();
    }

    @GetMapping(value = "/transaction/{id}")
    public Transaction getTransactionId(@PathVariable Integer id){
        return service.findById(id).get();
    }
    
    @PostMapping(value = "/transaction")
    public Transaction save(@RequestBody Transaction transaction){
        return service.save(transaction);
    }

    @DeleteMapping(value = "/transaction/{id}")
    public Transaction deleteTransaction(@PathVariable Integer id){
        Transaction transaction = service.findById(id).get();
        //transaction.setDeletedAt(); todo setar deletedAt
        // service.
        return transaction;
    }
}
