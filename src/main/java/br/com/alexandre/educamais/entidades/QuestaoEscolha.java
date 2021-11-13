package br.com.alexandre.educamais.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
@EqualsAndHashCode(callSuper = false, exclude = "questao")
public class QuestaoEscolha extends Entidade {

    @ManyToOne
    @JsonBackReference
    private Questao questao;

    private String texto;

    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Boolean correta = false;

}
