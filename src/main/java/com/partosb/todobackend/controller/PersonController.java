package com.partosb.todobackend.controller;

import com.partosb.todobackend.model.Person;
import com.partosb.todobackend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping(path = "/people")
    public Iterable<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @PostMapping("/people")
    public Person newPerson(@RequestBody Person newPerson) {
        return personRepository.save(newPerson);
    }

}
