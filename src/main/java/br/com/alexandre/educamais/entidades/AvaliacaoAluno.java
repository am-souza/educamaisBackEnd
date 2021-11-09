package br.com.alexandre.educamais.entidades;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class AvaliacaoAluno extends Entidade {

    @OneToOne
    private Avaliacao avaliacao;

    @OneToOne
    private Usuario aluno;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "avaliacaoAluno", orphanRemoval = true)
    private Set<AvaliacaoAlunoResposta> respostas = new HashSet<>();

    private Integer nota;

    private Integer pontuacaoTotal;

}
