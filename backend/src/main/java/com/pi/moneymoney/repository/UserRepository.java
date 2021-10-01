package com.pi.moneymoney.repository;

import com.pi.moneymoney.document.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String>{

    @Query("{'email' : ?0}")
    User findByEmail(String email);
    
}
