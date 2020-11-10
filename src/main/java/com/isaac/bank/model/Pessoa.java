package com.isaac.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }
}
