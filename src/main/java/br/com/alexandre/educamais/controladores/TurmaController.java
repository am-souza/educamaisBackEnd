package br.com.alexandre.educamais.controladores;

import br.com.alexandre.educamais.entidades.Turma;
import br.com.alexandre.educamais.servicos.TurmaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turmas")
public class TurmaController extends EntidadeController<Turma, TurmaService> {
}
