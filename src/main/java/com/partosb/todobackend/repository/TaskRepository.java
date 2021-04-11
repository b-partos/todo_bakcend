package com.partosb.todobackend.repository;

import com.partosb.todobackend.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {


}
