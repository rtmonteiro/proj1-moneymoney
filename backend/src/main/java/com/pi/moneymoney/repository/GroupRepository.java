package com.pi.moneymoney.repository;

import com.pi.moneymoney.document.Group;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Group,Integer>{
    
}
