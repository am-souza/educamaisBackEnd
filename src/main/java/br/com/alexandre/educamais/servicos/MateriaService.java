package br.com.alexandre.educamais.servicos;

import br.com.alexandre.educamais.entidades.Materia;
import br.com.alexandre.educamais.repositorios.MateriaRepository;
import br.com.alexandre.educamais.utilidades.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MateriaService extends EntidadeService<Materia, MateriaRepository> {

	/* Exemplo Sobreescrever método
	@Override
	public Avatar salvar(Avatar avatar) {
		System.out.println(avatar.getNome());
		return super.salvar(avatar);
	}	
	*/ 
 
}