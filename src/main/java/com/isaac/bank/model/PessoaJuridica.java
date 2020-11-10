package com.isaac.bank.model;

import javax.persistence.Column;

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
