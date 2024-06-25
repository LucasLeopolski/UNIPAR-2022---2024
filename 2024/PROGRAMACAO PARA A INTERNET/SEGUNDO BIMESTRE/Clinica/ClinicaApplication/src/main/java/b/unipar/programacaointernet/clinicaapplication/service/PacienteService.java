package b.unipar.programacaointernet.clinicaapplication.service;

import b.unipar.programacaointernet.clinicaapplication.model.Paciente;
import b.unipar.programacaointernet.clinicaapplication.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    private PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public void PacienteRepository (PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> getAll(){
        return  this.pacienteRepository.findAll();
    }

    public Paciente save (Paciente paciente){
        return  this.pacienteRepository.save(paciente);
    }

    public Paciente validarPaciente(String id, String nome){
        return  this.pacienteRepository.findByIdAndNome(id, nome);

    }z

}



