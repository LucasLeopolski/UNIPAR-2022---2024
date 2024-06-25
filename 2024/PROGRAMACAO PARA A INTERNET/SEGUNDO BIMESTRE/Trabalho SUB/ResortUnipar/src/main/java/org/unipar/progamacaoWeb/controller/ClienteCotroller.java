package org.unipar.progamacaoWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unipar.progamacaoWeb.model.ClienteModel;
import org.unipar.progamacaoWeb.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteCotroller {
        @Autowired
        private ClienteService clienteService;

        @PostMapping
        public ClienteModel cadastrarCliente(@RequestBody ClienteModel cliente) {
            return (ClienteModel) clienteService.cadastrarCliente(cliente);
        }

        // Outros métodos de endpoints para cliente
    }

