package com.isaac.bank.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "PessoaJuridica")
@DiscriminatorValue("PJ")
public class PessoaJuridica extends Pessoa {

    @Column
    private String cpnj;

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }
}
