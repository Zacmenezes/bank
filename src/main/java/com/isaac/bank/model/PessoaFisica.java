package com.isaac.bank.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "PessoaFisica")
@DiscriminatorValue("PF")
@JsonTypeName("PF")
public class PessoaFisica extends Cliente {

    @Column
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
