package br.com.alexandre.educamais.servicos;

import br.com.alexandre.educamais.entidades.Item;
import br.com.alexandre.educamais.repositorios.ItemRepository;
import br.com.alexandre.educamais.utilidades.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ItemService extends EntidadeService<Item, ItemRepository> {

	/* Exemplo Sobreescrever método
	@Override
	public Avatar salvar(Avatar avatar) {
		System.out.println(avatar.getNome());
		return super.salvar(avatar);
	}	
	*/ 
 
}