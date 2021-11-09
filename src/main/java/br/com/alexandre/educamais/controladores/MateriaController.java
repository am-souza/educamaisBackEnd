package br.com.alexandre.educamais.controladores;

import br.com.alexandre.educamais.entidades.Materia;
import br.com.alexandre.educamais.entidades.Usuario;
import br.com.alexandre.educamais.servicos.MateriaService;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materias")
public class MateriaController extends EntidadeController<Materia, MateriaService> {
	
		
}
