package br.com.alexandre.educamais.servicos;

import br.com.alexandre.educamais.entidades.Entidade;
import br.com.alexandre.educamais.repositorios.EntidadeRepository;
import io.github.perplexhub.rsql.RSQLJPASupport;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public abstract class EntidadeService<T extends Entidade, R extends EntidadeRepository<T>> {

    @Autowired
    protected R repository;

    public T buscar(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public T salvar(T entidade) {
        return repository.save(entidade);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public List<T> listar(String query) {
        return repository.findAll(RSQLJPASupport.toSpecification(query, true));
    }

}
