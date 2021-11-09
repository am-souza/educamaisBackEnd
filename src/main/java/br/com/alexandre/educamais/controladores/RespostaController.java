package br.com.alexandre.educamais.controladores;

import br.com.alexandre.educamais.entidades.Resposta;
import br.com.alexandre.educamais.servicos.RespostaService;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/respostas")
public class RespostaController extends EntidadeController<Resposta, RespostaService> {
	
}