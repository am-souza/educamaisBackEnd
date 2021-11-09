package br.com.alexandre.educamais.controladores;

import br.com.alexandre.educamais.entidades.Avatar;
import br.com.alexandre.educamais.entidades.Usuario;
import br.com.alexandre.educamais.servicos.AvatarService;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avatares")
public class AvatarController extends EntidadeController<Avatar, AvatarService> {
	
}

