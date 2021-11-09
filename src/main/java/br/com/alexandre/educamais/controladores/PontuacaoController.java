package br.com.alexandre.educamais.controladores;

import br.com.alexandre.educamais.entidades.Pontuacao;
import br.com.alexandre.educamais.servicos.PontuacaoService;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pontuacoes")
public class PontuacaoController extends EntidadeController<Pontuacao, PontuacaoService> {
	
}