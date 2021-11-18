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
public class Inventario extends Entidade {

   @OneToOne
   private Usuario usuario;

   @OrderBy("id")
   @JsonManagedReference
   @OneToMany
   private Set<Item> itens = new HashSet<>();
}
