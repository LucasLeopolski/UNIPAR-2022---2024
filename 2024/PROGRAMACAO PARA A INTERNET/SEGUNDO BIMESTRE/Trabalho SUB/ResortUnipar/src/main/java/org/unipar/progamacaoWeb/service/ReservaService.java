package org.unipar.progamacaoWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unipar.progamacaoWeb.model.ReservaModel;
import org.unipar.progamacaoWeb.repository.ReservaRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
    public class ReservaService {

        @Autowired
        private ReservaRepository reservaRepository;

        public ReservaModel criarReserva(ReservaModel reserva) {
            return reservaRepository.save(reserva);
        }


        public ReservaModel atualizarReserva(Long id, ReservaModel reservaAtualizada) {
            Optional<ReservaModel> reservaOptional = reservaRepository.findById(id);

            if (reservaOptional.isPresent()) {
                ReservaModel reservaExistente = reservaOptional.get();
                reservaExistente.setCliente(reservaAtualizada.getCliente());
                reservaExistente.setQuarto(reservaAtualizada.getQuarto());
                reservaExistente.setDataCheckin(reservaAtualizada.getDataCheckin());
                reservaExistente.setDataCheckout(reservaAtualizada.getDataCheckout());


                return reservaRepository.save(reservaExistente);
            } else {
                throw new RuntimeException("Reserva não encontrada com o id " + id);
            }
        }

        public boolean isQuartoDisponivel(Long quartoId, LocalDate dataCheckin, LocalDate dataCheckout) {
            List<ReservaModel> reservasConflitantes = reservaRepository.findReservasConflitantes(quartoId, dataCheckin, dataCheckout);
            return reservasConflitantes.isEmpty();
        }

        public ReservaModel obterReservaPorId(Long id) {
            return reservaRepository.findById(id).orElseThrow(() -> new RuntimeException("Reserva não encontrada com o id " + id));
        }

        public List<ReservaModel> obterTodasReservas() {
            return reservaRepository.findAll();
        }

        public void deletarReserva(Long id) {
            reservaRepository.deleteById(id);
        }
    }


