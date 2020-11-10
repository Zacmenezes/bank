package com.isaac.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Agencia {

    @Id
    @GeneratedValue
    private Long numeroAgencia;

    @OneToMany
    private List<Pessoa> clientes;
}
