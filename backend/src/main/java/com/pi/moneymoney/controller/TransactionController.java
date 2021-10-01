package com.pi.moneymoney.controller;

import java.util.List;

import com.pi.moneymoney.document.Transaction;
import com.pi.moneymoney.repository.TransactionRepository;
import com.pi.moneymoney.services.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/transaction")
public class TransactionController {
    @Autowired
    TransactionService service;

    @GetMapping(value = "")
    public List<Transaction> getTransaction(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Transaction getTransactionId(@PathVariable String id){
        return service.findById(id);
    }
    
    @PostMapping(value = "")
    public Transaction save(@RequestBody Transaction transaction){
        return service.save(transaction);
    }

    @DeleteMapping(value = "/{id}")
    public Transaction deleteTransaction(@PathVariable String id){
        return service.delete(id);
    }

    @GetMapping(value = "/usergroups")
    public List<Transaction> getTransactionsByUserAndGroup(@RequestParam String idUser, @RequestParam String idGroup) {
        return service.findByUserAndGroup(idUser,idGroup);
    }
}
