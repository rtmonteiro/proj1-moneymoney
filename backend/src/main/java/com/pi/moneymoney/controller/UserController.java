package com.pi.moneymoney.controller;

import java.util.List;

import com.pi.moneymoney.document.User;
import com.pi.moneymoney.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    

    @Autowired
    UserService service;

    @GetMapping(value = "/user")
    public List<User> getUser(){
        return service.findAll();
    }

    public User getUserId(@PathVariable Integer id){
        return service.findById(id);
    }
    
    @PostMapping(value = "/user")
    public User save(@RequestBody User user){
        return service.save(user);
    }



}
