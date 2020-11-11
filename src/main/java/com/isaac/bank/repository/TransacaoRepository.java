package com.isaac.bank.repository;

import com.isaac.bank.model.Cliente;
import com.isaac.bank.model.Conta;
import com.isaac.bank.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

    @Query("select t from transacao t inner join conta c where c = :c1 and t member of c.transacoes")
    List<Transacao> buscarPorConta(Conta c1);
}
