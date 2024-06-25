package b.unipar.programacaointernet.clinicaapplication.repository;

import b.unipar.programacaointernet.clinicaapplication.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Integer> {

    Medico findByIdAndNomeMedico(String id, String nome);
}
