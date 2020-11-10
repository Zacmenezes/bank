package com.isaac.bank.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "pessoa")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Tipo_Pessoa")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@class")
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }
}
