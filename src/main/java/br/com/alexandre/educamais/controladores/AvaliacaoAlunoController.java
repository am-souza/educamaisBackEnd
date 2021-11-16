package br.com.alexandre.educamais.controladores;


import br.com.alexandre.educamais.entidades.AvaliacaoAluno;
import br.com.alexandre.educamais.servicos.AvaliacaoAlunoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoesalunos")
public class AvaliacaoAlunoController extends EntidadeController<AvaliacaoAluno, AvaliacaoAlunoService> {
}
