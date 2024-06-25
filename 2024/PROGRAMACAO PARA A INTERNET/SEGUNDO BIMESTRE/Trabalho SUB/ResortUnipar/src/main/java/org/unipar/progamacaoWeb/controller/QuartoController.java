package org.unipar.progamacaoWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unipar.progamacaoWeb.model.QuartoModel;
import org.unipar.progamacaoWeb.service.QuartoService;

import java.util.List;

@RestController
@RequestMapping("/api/quartos")
public class QuartoController {

        @Autowired
        private QuartoService quartoService;

        @GetMapping
        public List<QuartoModel> buscarTodosQuartos() {
            return quartoService.buscarTodos();
        }

        @GetMapping("/disponiveis")
        public List<QuartoModel> buscarQuartosDisponiveis() {
            return quartoService.buscarTodosDisponiveis();
        }

        // Outros métodos de endpoints para quarto
    }


