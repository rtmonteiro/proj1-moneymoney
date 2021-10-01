package com.pi.moneymoney.repository;

import com.pi.moneymoney.document.Group;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends MongoRepository<Group,String>{
    
}
