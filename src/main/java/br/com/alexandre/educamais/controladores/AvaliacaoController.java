package br.com.alexandre.educamais.controladores;

import br.com.alexandre.educamais.entidades.Avaliacao;
import br.com.alexandre.educamais.servicos.AvaliacaoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController extends EntidadeController<Avaliacao, AvaliacaoService>{
}
