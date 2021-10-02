package com.pi.moneymoney.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pi.moneymoney.document.Group;
import com.pi.moneymoney.document.LoginForm;
import com.pi.moneymoney.document.Transaction;
import com.pi.moneymoney.document.User;
import com.pi.moneymoney.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/user")
public class UserController{

    @Autowired
    UserService service;

    @Autowired
    GroupController group ;

    @Autowired
    TransactionController transaction;

    @GetMapping(value = "")
    public List<User> getUser(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public User getUserId(@PathVariable String id){
        return service.findById(id);
    }
    
    @PostMapping(value = "")
    public User save(@RequestBody User user) throws Exception{

        if(getUserEmail(user.getEmail()) == null)
            return service.save(user);
        throw new Exception("E-mail ja cadastrado");
    }

    private User getUserEmail(String email) {
        return service.findByEmail(email);
    }

    @GetMapping(value = "/groups/{id}")
    public Map<String,List<Transaction>> getTransactionGroupedByGroup(@PathVariable String id){
        Map<String,List<Transaction>> groupedTransections = new HashMap<>();
        List<Group> groupsUser = group.findByIdUser(id);
        for (Group group : groupsUser) {
            groupedTransections.put(group.getName(), transaction.getTransactionsByUserAndGroup(id, group.getId()));
        }
        return groupedTransections;
    }

    @PostMapping(value = "/login")
    public User login(@RequestBody LoginForm user) throws Exception{
        User login = service.findByEmail(user.getEmail());
        if(login == null)
            throw new Exception("E-mail não cadastrado");
        if(login.getPassword().equalsIgnoreCase(user.getPassword())){
            return login;
        }
        throw new Exception("Senha informada está incorreta");

    }


}
