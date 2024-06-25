package b.unipar.programacaointernet.clinicaapplication.service;

import b.unipar.programacaointernet.clinicaapplication.model.Usuario;
import b.unipar.programacaointernet.clinicaapplication.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService { // vem a regra de negócio

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAll(){
        return this.usuarioRepository.findAll();

    }

    public Usuario save(Usuario usuario){
        return  this.usuarioRepository.save(usuario);
    }

    public Usuario validarUsuario(String login, String senha){
        return  this.usuarioRepository.findByLoginAndSenha(login, senha);
    }
}
