package br.com.alexandre.educamais.entidades;

import lombok.Data;

import javax.persistence.*;

import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Turma extends Entidade {

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String numeroTurma;
    
    private String periodo;
    
    private Date data;
    
    @OneToOne
    private Materia materia;

    @ManyToMany
    private Set<Usuario> alunos = new HashSet<>();

    @OneToOne
    private Usuario tutor;
    
}
