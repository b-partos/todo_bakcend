package com.partosb.todobackend.controller;

import com.partosb.todobackend.model.Task;
import com.partosb.todobackend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @PutMapping(path = "/tasks/{id}")
    Task updateTask(@RequestBody Task updatedTask, @PathVariable Long id) {
        return taskRepository.findById(id).map(t -> {
            t.setShortname(updatedTask.getShortname());
            t.setStatus(updatedTask.getStatus());
            t.setDescription(updatedTask.getDescription());
            t.setAssignee(updatedTask.getAssignee());
            return taskRepository.save(t);
        }).orElse(null);
    }

}
