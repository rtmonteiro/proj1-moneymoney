package com.pi.moneymoney.repository;

import java.util.List;

import com.pi.moneymoney.document.Group;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends MongoRepository<Group,String>{

    @Query("{'idUser' : ?0}")
    public List<Group> findByUser(String user);
}
