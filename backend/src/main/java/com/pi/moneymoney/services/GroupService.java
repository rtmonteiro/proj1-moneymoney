package com.pi.moneymoney.services;

import java.util.List;

import com.pi.moneymoney.document.Group;
import com.pi.moneymoney.repository.GroupRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class GroupService implements Service<Group>{
    @Autowired
    GroupRepository rp;

    @Override
    public List<Group> findAll() {
        return rp.findAll();
    }

    @Override
    public Group findById(Integer id) {
        return rp.findById(id).get();
    }

    @Override
    public Group save(Group objecT) {
        return rp.save(objecT);
    }

    public Group delete(Group group){

        // TODO
        return group;
    }
}
