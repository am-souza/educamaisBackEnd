package br.com.alexandre.educamais.entidades;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Materia extends Entidade {

	@Column(nullable = false)
	private String nome;

	@OneToOne
	private Usuario tutor;
   
   
}