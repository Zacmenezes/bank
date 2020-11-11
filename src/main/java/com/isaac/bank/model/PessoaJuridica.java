package com.isaac.bank.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "PessoaJuridica")
@DiscriminatorValue("PJ")
@JsonTypeName("PJ")
public class PessoaJuridica extends Cliente {

    @Column
    private String cpnj;

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }
}
