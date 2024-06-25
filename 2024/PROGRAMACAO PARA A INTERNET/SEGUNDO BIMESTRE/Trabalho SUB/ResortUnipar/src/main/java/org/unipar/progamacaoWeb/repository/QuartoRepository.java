package org.unipar.progamacaoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.unipar.progamacaoWeb.model.QuartoModel;

import java.util.List;

@Repository
public interface QuartoRepository extends JpaRepository<QuartoModel, Long> {

        List<QuartoModel> findByVistaMarAndDisponivel(boolean vistaMar, boolean disponivel);

        List<QuartoModel> findByQtdMaxOcupantes(int qtdMaxOcupantes);

        List<QuartoModel> findByDisponivel(boolean disponivel);
    }


