package com.isaac.bank.api;

import com.isaac.bank.model.Pessoa;
import com.isaac.bank.repository.PessoaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PessoaController {

    private final PessoaRepository repository;

    PessoaController(PessoaRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/clientes")
    List<Pessoa> buscarTodosClientes() {
        return repository.findAll();
    }

    @PostMapping("/clientes")
    Pessoa novoCliente(@RequestBody Pessoa pessoa) {
        System.out.println(pessoa);
        return repository.save(pessoa);
    }
}
