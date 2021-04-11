package com.partosb.todobackend.controller;

import com.partosb.todobackend.model.Task;
import com.partosb.todobackend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    @GetMapping(path = "/tasks")
    Iterable<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @PostMapping(path = "/tasks")
    Task addTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

}
