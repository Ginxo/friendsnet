package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.PersonGroup;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.GroupManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupManager manager;

    @GetMapping
    public List<PersonGroup> getAll(){
        return (List<PersonGroup>) manager.findAll();
    }

    @GetMapping("/{id}")
    public PersonGroup getById(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public PersonGroup create(@RequestBody PersonGroup personGroup){
        return manager.save(personGroup);
    }

    @PostMapping("/{id}/relate")
    public PersonGroup relate(@PathVariable Long id, @RequestBody List<Long> persons){
        return null;
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id){
        manager.remove(id);
    }
}
