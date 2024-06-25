package b.unipar.programacaointernet.clinicaapplication.repository;

import b.unipar.programacaointernet.clinicaapplication.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByLoginAndSenha(String login, String senha);
}
