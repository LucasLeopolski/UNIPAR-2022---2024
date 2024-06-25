package b.unipar.programacaointernet.clinicaapplication.service;

import b.unipar.programacaointernet.clinicaapplication.model.Medico;
import b.unipar.programacaointernet.clinicaapplication.repository.MedicoRepository;

import java.util.List;

public class MedicoService {

    private MedicoRepository medicoRepository = null;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public List<Medico>getAll(){

        return this.medicoRepository.findAll();
    }

    public Medico save(Medico medico){
        return this.medicoRepository.save(medico);

    }

    public Medico validarMeedico(String id, String nome){

        return  this.medicoRepository.findByIdAndNomeMedico(id, nome);
    }
}
