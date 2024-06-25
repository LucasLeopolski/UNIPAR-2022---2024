package org.unipar.progamacaoWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unipar.progamacaoWeb.model.ClienteModel;
import org.unipar.progamacaoWeb.repository.ClienteRepository;

@Service
public class ClienteService {
        @Autowired
        private ClienteRepository clienteRepository;

        public ClienteRepository cadastrarCliente(ClienteModel cliente) {
            // Lógica para validar idade, etc.
            return (ClienteRepository) clienteRepository.save(cliente);
        }

        // Outros métodos de serviço conforme necessidade
    }

