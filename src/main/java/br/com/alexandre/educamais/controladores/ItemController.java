package br.com.alexandre.educamais.controladores;

import br.com.alexandre.educamais.entidades.Item;
import br.com.alexandre.educamais.servicos.ItemService;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itens")
public class ItemController extends EntidadeController<Item, ItemService> {
}
