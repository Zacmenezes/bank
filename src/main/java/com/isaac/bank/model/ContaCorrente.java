package com.isaac.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "conta")
public class ContaCorrente {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "numero_conta")
    private Long numeroConta;

    @Column
    private Double saldo;

    public Long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldoAtual) {
        this.saldo = saldoAtual;
    }
}
