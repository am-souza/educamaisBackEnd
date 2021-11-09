package br.com.alexandre.educamais.controladores;

import br.com.alexandre.educamais.entidades.Atividade;
import br.com.alexandre.educamais.servicos.AtividadeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class AtividadeController extends EntidadeController<Atividade, AtividadeService>{
}
