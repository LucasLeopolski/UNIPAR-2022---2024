package b.unipar.programacaointernet.clinicaapplication.controller;

import b.unipar.programacaointernet.clinicaapplication.model.Usuario;
import b.unipar.programacaointernet.clinicaapplication.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // anotação responsavel por gerenciar as nossas dependencias
public class UsuarioApiController {

    private final UsuarioService usuarioService;

    public UsuarioApiController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

@GetMapping(path = "/api/usuarios")
    public ResponseEntity<List<Usuario>> getAll(){
        return  ResponseEntity.ok(
                this.usuarioService.getAll()
        );

    }
    @PostMapping(path =  "/api/usuarios")
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
        return  ResponseEntity.ok(this.usuarioService.save(usuario));
    }
}
