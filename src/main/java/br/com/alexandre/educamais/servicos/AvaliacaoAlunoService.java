package br.com.alexandre.educamais.servicos;


import br.com.alexandre.educamais.entidades.AvaliacaoAluno;
import br.com.alexandre.educamais.entidades.Turma;
import br.com.alexandre.educamais.repositorios.AvaliacaoAlunoRepository;
import br.com.alexandre.educamais.repositorios.TurmaRepository;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoAlunoService extends EntidadeService <AvaliacaoAluno , AvaliacaoAlunoRepository>{

    public void entregar(AvaliacaoAluno avaliacaoAluno) {
        var avaliacao = avaliacaoAluno.getAvaliacao();
        var atividade = avaliacao.getAtividade();
        var respostas = avaliacaoAluno.getRespostas();
        var nota = 0;
        for (var resposta : respostas) {
            if (resposta.getAlternativaEscolhida().getCorreta()) {
                ++nota;
            }
        }
        var notaIndividual = avaliacaoAluno.getPontuacaoTotal() / atividade.getQuestoes().size();
        var notaFinal = notaIndividual * nota;
        avaliacaoAluno.setNota(notaFinal);
        salvar(avaliacaoAluno);
    }

}
