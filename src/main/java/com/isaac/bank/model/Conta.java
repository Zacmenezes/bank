package com.isaac.bank.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import springfox.documentation.annotations.ApiIgnore;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @ApiModelProperty(hidden=true)
    private Long id;

    @Column(name = "numero_conta", unique = true)
    private Long numeroConta;

    @ManyToOne(cascade = ALL)
    private Agencia agencia;

    @OneToOne(cascade = ALL)
    private Cliente cliente;

    @Column
    private Double saldo;

    @OneToMany
    @ApiModelProperty(hidden=true)
    private List<Transacao> transacoes;

    public Long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldoAtual) {
        this.saldo = saldoAtual;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }
}
