package br.com.alexandre.educamais.servicos;

import br.com.alexandre.educamais.entidades.Avatar;
import br.com.alexandre.educamais.entidades.Usuario;
import br.com.alexandre.educamais.repositorios.AvatarRepository;
import br.com.alexandre.educamais.utilidades.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AvatarService extends EntidadeService<Avatar, AvatarRepository> {

	/* Exemplo Sobreescrever método
	@Override
	public Avatar salvar(Avatar avatar) {
		System.out.println(avatar.getNome());
		return super.salvar(avatar);
	}	
	*/ 
 
}
