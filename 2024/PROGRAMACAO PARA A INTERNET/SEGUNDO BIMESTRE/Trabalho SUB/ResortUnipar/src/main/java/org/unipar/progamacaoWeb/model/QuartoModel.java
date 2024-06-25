package org.unipar.progamacaoWeb.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class QuartoModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private int qtdMaxOcupantes;
        private boolean vistaMar;
        private BigDecimal valor;
        private String descricao;


        @Transient
        public BigDecimal getValorTotal() {
            if (vistaMar) {
                return valor.multiply(BigDecimal.valueOf(2));
            } else {
                return valor;
            }
        }
    }


