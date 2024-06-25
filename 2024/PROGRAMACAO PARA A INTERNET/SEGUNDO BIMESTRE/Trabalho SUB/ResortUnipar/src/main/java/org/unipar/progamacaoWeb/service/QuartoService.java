package org.unipar.progamacaoWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unipar.progamacaoWeb.model.QuartoModel;
import org.unipar.progamacaoWeb.repository.QuartoRepository;

import java.util.List;

@Service
public class QuartoService {
        @Autowired
        private QuartoRepository quartoRepository;

        public List<QuartoModel> buscarTodos() {
            return quartoRepository.findAll();
        }

        public List<QuartoModel> buscarTodosDisponiveis() {
            return quartoRepository.findByDisponivel(true);
        }

        // Outros métodos de serviço conforme necessidade
    }


