package com.pi.moneymoney.controller;

import java.util.List;

import com.pi.moneymoney.document.Group;
import com.pi.moneymoney.services.GroupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class GroupController {

    @Autowired
    GroupService service;

    @GetMapping(value = "/group")
    public List<Group> getGroup(){
        return service.findAll();
    }

    @GetMapping(value = "/group/{id}")
    public Group getGroupId(@PathVariable Integer id){
        return service.findById(id);
    }
    
    @PostMapping(value = "/Group")
    public Group save(@RequestBody Group group){
        return service.save(group);
    }

    @DeleteMapping(value = "/group/{id}")
    public Group deleteGroup(@PathVariable Integer id){
        Group group = service.findById(id);
        //group.setDeletedAt(); todo setar deletedAt
        // service.
        return group;
    }
}
