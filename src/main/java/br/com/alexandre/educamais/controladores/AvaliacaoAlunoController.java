package br.com.alexandre.educamais.controladores;


import br.com.alexandre.educamais.entidades.AvaliacaoAluno;
import br.com.alexandre.educamais.servicos.AvaliacaoAlunoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoesalunos")
public class AvaliacaoAlunoController extends EntidadeController<AvaliacaoAluno, AvaliacaoAlunoService>{
/*
    @PostMapping("/entregar")
    public void entregar(@RequestBody AvaliacaoAluno avaliacaoAluno) {
        service.entregar(avaliacaoAluno);
    }
*/
}
