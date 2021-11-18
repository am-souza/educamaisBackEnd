package br.com.alexandre.educamais.servicos;

import br.com.alexandre.educamais.entidades.Inventario;
import br.com.alexandre.educamais.repositorios.InventarioRepository;
import org.springframework.stereotype.Service;

@Service
public class InventarioService extends EntidadeService<Inventario, InventarioRepository> {

	/* Exemplo Sobreescrever método
	@Override
	public Avatar salvar(Avatar avatar) {
		System.out.println(avatar.getNome());
		return super.salvar(avatar);
	}	
	*/ 
 
}
