package br.com.alexandre.educamais.controladores;

import br.com.alexandre.educamais.entidades.Usuario;
import br.com.alexandre.educamais.servicos.UsuarioService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends EntidadeController<Usuario, UsuarioService> {

    @GetMapping("/eu")
    public Usuario findByCurrentSession() {
        return service.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
    }

}
