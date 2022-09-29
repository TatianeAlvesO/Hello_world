package com.helloworld.helloworld.controller;

/* ATtividade 1: Crie um projeto Spring que possua 3 endpoints:
  O primeiro endpoint deverá exibir a mensagem: Hello World!
  O segundo endpoint deverá exibir a lista de BSM’s da Generation Brasil.
  O terceiro endpoint deverá exibir uma lista contendo os seus Objetivos de aprendizagem desta semana. */

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BSM")
public class BSMController {
	
	@GetMapping
	public String BSM() {
	return "Lista de BSM's da Generation Brasil:<br>Orientação ao Futuro<br>Responsabilidade Pessoal<br>Mentalidade de Crescimento<br>Persistência<br>Trabalho em Equipe<br>Atenção aos Detalhes<br>Proatividade<br>Comunicação";
				
	}

	
}
