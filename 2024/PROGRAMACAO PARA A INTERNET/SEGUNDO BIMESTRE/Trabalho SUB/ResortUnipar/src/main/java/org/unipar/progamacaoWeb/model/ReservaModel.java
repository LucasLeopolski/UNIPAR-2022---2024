package org.unipar.progamacaoWeb.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class ReservaModel {

        public enum Status {
            PENDENTE, ABERTO, FECHADO
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "cliente_id")
        private ClienteModel cliente;

        @ManyToOne
        @JoinColumn(name = "quarto_id")
        private QuartoModel quarto;

        private LocalDate dataCheckin;
        private LocalDate dataCheckout;
        private Status status;


    }

