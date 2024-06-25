package b.unipar.programacaointernet.clinicaapplication.controller;

import b.unipar.programacaointernet.clinicaapplication.model.Usuario;
import b.unipar.programacaointernet.clinicaapplication.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LoginWebController { // avisa que vai conversar entre JSON e XML

    private final UsuarioService usuarioService;

    public LoginWebController(UsuarioService ususarioService) {
        this.usuarioService = ususarioService;
    }

    @GetMapping("/login")
    public String loginForm(){
        return "login"; // retorna a pagina de login (login.html)
    }

    @GetMapping("/hello-world")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name){

        return "Hello "+ name + "!";


    }

    @GetMapping("/bemvindo")
    public  String bemvindo(){
        return "bemvindo";
    }
    @PostMapping("/login")
    public String login(@RequestParam("usarname")String usarname,
                        @RequestParam("password")String password,
                        HttpSession session, Model model){

        Usuario usuario = usuarioService.validarUsuario(usarname, password);
        if(usarname.equals("ze") && password.equals("123")){
            //se o usuario estiver válido
            session.setAttribute("usuarioLogado", usarname);
            return "redirect:/bemvindo";
        }else {
            model.addAttribute("erro", "Usuaário ou senha inválidos");

        }
        return "login";
    }
}
