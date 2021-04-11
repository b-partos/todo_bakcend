package com.partosb.todobackend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String shortname;

    private String description;

    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @ManyToOne
    private Person assignee;

}
