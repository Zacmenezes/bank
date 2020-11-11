package com.isaac.bank.api;

import com.isaac.bank.model.Conta;
import com.isaac.bank.model.Transacao;
import com.isaac.bank.repository.ContaRepository;
import com.isaac.bank.repository.TransacaoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransacaoController {

    private final TransacaoRepository transacaoRepository;
    private final ContaRepository contaRepository;

    public TransacaoController(TransacaoRepository transacaoRepository, ContaRepository contaRepository) {
        this.transacaoRepository = transacaoRepository;
        this.contaRepository = contaRepository;
    }

    @GetMapping("/transacoes/{id-conta}")
    List<Transacao> obterExtrato(@PathVariable(value="id-conta") Long id) {
        Conta conta = contaRepository.findById(id).orElse(null);
        return transacaoRepository.buscarPorConta(conta);
    }


}
