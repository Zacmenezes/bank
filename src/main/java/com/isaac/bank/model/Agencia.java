package com.isaac.bank.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.GenerationType.*;

@Entity(name = "agencia")
public class Agencia {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @ApiModelProperty(hidden=true)
    private Long id;

    @Column(name = "numero_agencia")
    private Long numeroAgencia;

    @OneToMany(cascade = ALL)
    @ApiModelProperty(hidden=true)
    private List<Conta> contas;

    public Long getId() {
        return id;
    }

    public Long getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Long numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
