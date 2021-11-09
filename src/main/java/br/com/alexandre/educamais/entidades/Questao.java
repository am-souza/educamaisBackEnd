package br.com.alexandre.educamais.entidades;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Questao extends Entidade {

    @Column(nullable = false)
    private String texto;

    @OneToOne
    private Materia materia;

    @JsonManagedReference
    @OneToMany(mappedBy = "questao", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<QuestaoEscolha> escolhas = new HashSet<>();

}
