package com.partosb.todobackend.controller;

import com.partosb.todobackend.model.Person;
import com.partosb.todobackend.model.Task;
import com.partosb.todobackend.repository.PersonRepository;
import com.partosb.todobackend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping(path = "/people")
    public Iterable<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @PostMapping("/people")
    public Person newPerson(@RequestBody Person newPerson) {
        return personRepository.save(newPerson);
    }

    @PostMapping("/people/{personId}/tasks/{taskId}/add")
    public Person addTaskToPerson(@PathVariable final Long personId, @PathVariable final Long taskId) {
        Person person = personRepository.findById(personId).orElseThrow(IllegalArgumentException::new);
        Task task = taskRepository.findById(taskId).orElseThrow(IllegalArgumentException::new);
        person.getTasks().add(task);
        personRepository.save(  person);
        return  person;
    }

}
