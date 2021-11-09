package br.com.alexandre.educamais.controladores;

import br.com.alexandre.educamais.entidades.Questao;
import br.com.alexandre.educamais.servicos.QuestaoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questoes")
public class QuestaoController extends EntidadeController<Questao, QuestaoService>{
}
