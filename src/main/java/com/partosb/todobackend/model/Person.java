package com.partosb.todobackend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, updatable = false)
    private String userName;

    private String emailAddress;

    @OneToMany
    private List<Task> tasks;


}
