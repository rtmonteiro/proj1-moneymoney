package com.pi.moneymoney.services;

import java.util.List;

import com.pi.moneymoney.document.Group;
import com.pi.moneymoney.repository.GroupRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService implements Services<Group>{

    @Autowired
    GroupRepository rp;

    @Override
    public List<Group> findAll() {
        return rp.findAll();
    }

    @Override
    public Group findById(String id) {
        return rp.findById(id).get();
    }

    @Override
    public Group save(Group objecT) {
        return rp.save(objecT);
    }

    public Group delete(Group group){

        rp.delete(group);
        return group;
    }

    public List<Group> findByIdUser(String id) {
        return rp.findByUser(id);
    }
}
