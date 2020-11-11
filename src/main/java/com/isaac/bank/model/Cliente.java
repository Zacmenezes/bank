package com.isaac.bank.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "cliente")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_cliente")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = PessoaFisica.class, name = "PF"),
        @JsonSubTypes.Type(value = PessoaJuridica.class, name = "PJ") }
)
@ApiModel(subTypes = {PessoaFisica.class, PessoaJuridica.class}, discriminator = "tipo_cliente")
public abstract class Cliente {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    @ApiModelProperty(hidden=true)
    private Long id;

    @OneToOne(cascade = ALL)
    @JoinColumn(name = "id")
    private Conta conta;

    public Long getId() {
        return id;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
