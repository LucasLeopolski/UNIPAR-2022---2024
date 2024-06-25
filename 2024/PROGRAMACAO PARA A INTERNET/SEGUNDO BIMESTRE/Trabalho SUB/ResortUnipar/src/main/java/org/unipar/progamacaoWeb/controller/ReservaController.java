package org.unipar.progamacaoWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.unipar.progamacaoWeb.model.ClienteModel;
import org.unipar.progamacaoWeb.model.ReservaModel;
import org.unipar.progamacaoWeb.repository.ReservaRepository;
import org.unipar.progamacaoWeb.service.ReservaService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

        @Autowired
        private ReservaService reservaService;


        @PostMapping
        public ResponseEntity<ReservaModel> criarReserva(@RequestBody ReservaModel reserva) {
            ReservaModel novaReserva = (ReservaModel) reservaService.criarReserva(reserva);
            return ResponseEntity.ok((ReservaModel) novaReserva);
        }

        @PutMapping("/{id}")
        public ResponseEntity<ReservaModel> atualizarReserva(@PathVariable Long id, @RequestBody ReservaModel reservaAtualizada) {
            ReservaModel reserva = reservaService.atualizarReserva(id, reservaAtualizada);
            return ResponseEntity.ok(reserva);
        }

        @GetMapping("/{id}")
        public ResponseEntity<ReservaModel> obterReservaPorId(@PathVariable Long id) {
            ReservaModel reserva = reservaService.obterReservaPorId(id);
            return ResponseEntity.ok(reserva);
        }

        @GetMapping
        public ResponseEntity<List<ReservaModel>> obterTodasReservas() {
            List<ReservaModel> reservas = reservaService.obterTodasReservas();
            return ResponseEntity.ok(reservas);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deletarReserva(@PathVariable Long id) {
            reservaService.deletarReserva(id);
            return ResponseEntity.noContent().build();
        }

        @GetMapping("/disponibilidade")
        public ResponseEntity<Boolean> verificarDisponibilidade(@RequestParam Long quartoId,
                                                                @RequestParam String dataCheckin,
                                                                @RequestParam String dataCheckout) {
            LocalDate checkin = LocalDate.parse(dataCheckin);
            LocalDate checkout = LocalDate.parse(dataCheckout);
            boolean disponivel = reservaService.isQuartoDisponivel(quartoId, checkin, checkout);
            return ResponseEntity.ok(disponivel);
        }
    }

