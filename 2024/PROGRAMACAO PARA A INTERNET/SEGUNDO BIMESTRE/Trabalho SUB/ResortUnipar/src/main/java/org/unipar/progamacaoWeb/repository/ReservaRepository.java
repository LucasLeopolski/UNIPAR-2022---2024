package org.unipar.progamacaoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.unipar.progamacaoWeb.model.ClienteModel;
import org.unipar.progamacaoWeb.model.ReservaModel;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<ReservaModel, Long> {
        List<ReservaModel> findByCliente(ClienteModel cliente);
        List<ReservaModel> findByDataCheckin(LocalDate dataCheckin);

    @Query("SELECT r FROM ReservaModel r WHERE r.quarto.id = :quartoId AND " +
            "(r.dataCheckin < :dataCheckout AND r.dataCheckout > :dataCheckin)")
    List<ReservaModel> findReservasConflitantes(@Param("quartoId") Long quartoId,
                                           @Param("dataCheckin") LocalDate dataCheckin,
                                           @Param("dataCheckout") LocalDate dataCheckout);
    }

