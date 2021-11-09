package br.com.alexandre.educamais.entidades;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Turma extends Entidade {

    public enum Periodo {
        INTEGRAL,
        MATUTINO,
        VESPERTINO,
        NOTURNO
    }

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String numeroTurma;

    @Enumerated
    private Periodo periodo;
    
    private LocalDate data;
    
    @OneToOne
    private Materia materia;

    @ManyToMany
    private Set<Usuario> alunos = new HashSet<>();

    @OneToOne
    private Usuario tutor;
    
}
