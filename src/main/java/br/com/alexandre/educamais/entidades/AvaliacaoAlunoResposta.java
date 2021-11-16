package br.com.alexandre.educamais.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@Entity
@EqualsAndHashCode(callSuper = false, exclude = "avaliacaoAluno")
public class AvaliacaoAlunoResposta extends Entidade {

    @ManyToOne
    @JsonBackReference
    private AvaliacaoAluno avaliacaoAluno;

    @OneToOne
    private Questao questao;

    @OneToOne
    private QuestaoEscolha alternativaEscolhida;

}
