package b.unipar.programacaointernet.clinicaapplication.repository;

import b.unipar.programacaointernet.clinicaapplication.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

    Paciente findByIdAndNome(String id, String nome);
}
