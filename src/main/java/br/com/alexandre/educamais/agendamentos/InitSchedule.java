package br.com.alexandre.educamais.agendamentos;

import br.com.alexandre.educamais.entidades.Usuario;
import br.com.alexandre.educamais.servicos.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class InitSchedule {

    private final UsuarioService usuarioService;

    @PostConstruct
    public void init() {
        try {
            usuarioService.findUserByUsername("admin");
        } catch (UsernameNotFoundException ignored) {
            var usuario = new Usuario();
            usuario.setNome("Administrador");
            usuario.setUsername("admin");
            usuario.setPassword("admin");
            usuario.setPerfil(Usuario.Perfil.ADMINISTRADOR);
            usuarioService.salvar(usuario);
        }
    }

}
