package br.com.alexandre.educamais.controladores;

import br.com.alexandre.educamais.entidades.Entidade;
import br.com.alexandre.educamais.servicos.EntidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public abstract class EntidadeController<T extends Entidade, S extends EntidadeService<T, ?>> {

    @Autowired
    protected S service;

    @GetMapping("/{id}")
    public T buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PostMapping
    public T salvar(@RequestBody T entidade) {
        return service.salvar(entidade);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }

    @GetMapping
    public List<T> listar(HttpServletRequest httpRequest) {
        return service.listar(httpRequest.getQueryString());
    }

}
