package com.isaac.bank.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "PessoaFisica")
@DiscriminatorValue("PF")
public class PessoaFisica extends Pessoa {

    @Column
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
