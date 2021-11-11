package br.com.alexandre.educamais.entidades;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Atividade extends Entidade {

	@Column(nullable = false)
	private String nome; 

	@ManyToMany
    private Set<Questao> questoes = new HashSet<>();

}
