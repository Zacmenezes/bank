package com.isaac.bank.model;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "numero_conta")
    private Long numeroConta;

    @OneToOne
    private Pessoa cliente;

    @Column
    private Double saldo;

    @OneToMany
    private List<Transacao> transacoes;

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

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }
}
