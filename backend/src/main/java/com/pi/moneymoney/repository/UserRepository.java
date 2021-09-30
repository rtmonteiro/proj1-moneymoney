package com.pi.moneymoney.repository;

import com.pi.moneymoney.document.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer>{
    
}
