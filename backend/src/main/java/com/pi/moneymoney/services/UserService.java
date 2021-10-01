package com.pi.moneymoney.services;

import java.util.List;

import com.pi.moneymoney.document.User;
import com.pi.moneymoney.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements Services<User>{

    @Autowired
    UserRepository rp;

    @Override
    public List<User> findAll() {
        return rp.findAll();
    }

    @Override
    public User findById(String id) {
        return rp.findById(id).get();
    }

    @Override
    public User save(User objecT) {
        return rp.save(objecT);
    }
    
}
