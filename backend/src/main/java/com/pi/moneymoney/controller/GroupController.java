package com.pi.moneymoney.controller;

import java.util.List;

import com.pi.moneymoney.document.Group;
import com.pi.moneymoney.services.GroupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/group")
public class GroupController {

    @Autowired
    GroupService service;

    @GetMapping(value = "")
    public List<Group> getGroup(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Group getGroupId(@PathVariable String id){
        return service.findById(id);
    }
    
    @PostMapping(value = "")
    public Group save(@RequestBody Group group){
        return service.save(group);
    }

    @DeleteMapping(value = "/{id}")
    public Group deleteGroup(@PathVariable String id){
        Group group = service.findById(id);
        service.delete(group);
        return group;
    }

    @GetMapping(value = "/user/{id}")
    public List<Group> findByIdUser(@PathVariable String id) {
        return service.findByIdUser(id);
        
    }
}
