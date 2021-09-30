package com.pi.moneymoney.services;

import java.util.List;

import com.pi.moneymoney.document.User;
import com.pi.moneymoney.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements Service<User>{

    @Autowired
    UserRepository rp;

    @Override
    public List<User> findAll() {
        return rp.findAll();
    }

    @Override
    public User findById(Integer id) {
        return rp.findById(id).get();
    }

    @Override
    public User save(User objecT) {
        return rp.save(objecT);
    }
    
}
