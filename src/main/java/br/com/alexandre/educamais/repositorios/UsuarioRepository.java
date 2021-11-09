package br.com.alexandre.educamais.repositorios;

import br.com.alexandre.educamais.entidades.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends EntidadeRepository<Usuario> {

    Optional<Usuario> findByUsername(String username);

}
