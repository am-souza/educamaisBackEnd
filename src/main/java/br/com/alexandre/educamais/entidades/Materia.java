package br.com.alexandre.educamais.entidades;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Materia extends Entidade {

	@Column(nullable = false)
	private String nome;

	//@OneToOne
	//private Usuario tutor;
   
   
}