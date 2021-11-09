package br.com.alexandre.educamais.entidades;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class Atividade extends Entidade {

	@Column(nullable = false)
	private Date dtInicio;
	@Column(nullable = false)
	private Date dtFim;
	@Column(nullable = false)
	private String nome; 

	@ManyToMany
    private Set<Questao> questoes = new HashSet<>();

}
