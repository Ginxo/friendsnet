package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.PersonManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonManager manager;

    @GetMapping
    public List<Person> getAll(){
        return (List<Person>) manager.findAll();
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public Person create(@RequestBody Person person){
        return manager.save(person);
    }

    @PostMapping("/{id}/relate")
    public Person relate(@PathVariable Long id, @RequestBody List<Long> persons){
        return this.manager.relatePersons(id, persons);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id){
        manager.remove(id);
    }
}
