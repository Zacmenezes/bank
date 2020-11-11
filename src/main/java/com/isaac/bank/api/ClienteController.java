package com.isaac.bank.api;

import com.isaac.bank.model.Cliente;
import com.isaac.bank.repository.ClienteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {

    private final ClienteRepository repository;

    ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/clientes")
    List<Cliente> buscarTodosClientes() {
        return repository.findAll();
    }

    @PostMapping("/clientes")
    Cliente novoCliente(@RequestBody Cliente cliente) {
        System.out.println(cliente);
        return repository.save(cliente);
    }
}
