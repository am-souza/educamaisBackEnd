package br.com.alexandre.educamais.servicos;

import br.com.alexandre.educamais.entidades.Usuario;
import br.com.alexandre.educamais.repositorios.UsuarioRepository;
import br.com.alexandre.educamais.utilidades.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends EntidadeService<Usuario, UsuarioRepository> {

	 public UserDetails findUserByUsername(String username) {
	        return new UserDetailsImpl(findByUsername(username));
	    }

	    public Usuario findByUsername(String username) {
	        return repository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(username));
	    }

	    @Override
	    public Usuario salvar(Usuario usuario) {
	        if (usuario.getPassword() == null && usuario.getId() != null) {
	            usuario.setPassword(findByUsername(usuario.getUsername()).getPassword());
	        }
	        return super.salvar(usuario);
	    }		
}
