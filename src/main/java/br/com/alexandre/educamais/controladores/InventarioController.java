package br.com.alexandre.educamais.controladores;

import br.com.alexandre.educamais.entidades.Inventario;
import br.com.alexandre.educamais.servicos.InventarioService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventarios")
public class InventarioController extends EntidadeController<Inventario, InventarioService> {
	
}

