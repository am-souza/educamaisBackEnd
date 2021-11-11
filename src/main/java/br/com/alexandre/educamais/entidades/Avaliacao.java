package br.com.alexandre.educamais.entidades;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Avaliacao extends Entidade {

    @OneToOne
    private Atividade atividade;

    @OneToOne
    private Turma turma;

    private LocalDateTime inicio;

    private LocalDateTime fim;

    private Integer valor;

}
