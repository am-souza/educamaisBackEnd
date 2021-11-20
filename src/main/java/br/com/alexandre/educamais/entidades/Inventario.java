package br.com.alexandre.educamais.entidades;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Inventario extends Entidade {

   @OneToOne
   private Usuario usuario;

   @ManyToMany
   @OrderBy("id")
   private Set<Item> itens = new HashSet<>();

}
