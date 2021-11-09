package br.com.alexandre.educamais.entidades;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Curso extends Entidade {

   @Column(nullable = false)
   private String nome;

}
