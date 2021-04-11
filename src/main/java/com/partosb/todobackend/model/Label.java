package com.partosb.todobackend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Label {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true, updatable = false)
    private String name;

    private String description;

}
