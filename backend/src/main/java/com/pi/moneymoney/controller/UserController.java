package com.pi.moneymoney.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pi.moneymoney.document.Group;
import com.pi.moneymoney.document.Transaction;
import com.pi.moneymoney.document.User;
import com.pi.moneymoney.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    

    @Autowired
    UserService service;

    GroupController group = new GroupController();
    TransactionController transaction = new TransactionController();

    @GetMapping(value = "")
    public List<User> getUser(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public User getUserId(@PathVariable String id){
        return service.findById(id);
    }
    
    @PostMapping(value = "")
    public User save(@RequestBody User user){
        return service.save(user);
    }

    public Map<Group,List<Transaction>> getTransactionGroupedByGroup(String id){
        Map<Group,List<Transaction>> groupedTransections = new HashMap<>();
        List<Group> groupsUser = group.findByIdUser(id);
        for (Group group : groupsUser) {
            groupedTransections.put(group, transaction.getTransactionsByUserAndGroup(id, group.getId()));
        }
        return groupedTransections;
    }


}
