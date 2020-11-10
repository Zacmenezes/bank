package com.isaac.bank.model;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.*;

@Entity(name = "agencia")
public class Agencia {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "numero_agencia")
    private Long numeroAgencia;

    @OneToMany
    private List<Pessoa> clientes;

    public Long getId() {
        return id;
    }

    public Long getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Long numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public List<Pessoa> getClientes() {
        return clientes;
    }

    public void setClientes(List<Pessoa> clientes) {
        this.clientes = clientes;
    }
}
