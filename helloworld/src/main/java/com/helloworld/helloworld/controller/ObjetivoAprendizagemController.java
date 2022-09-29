package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Objetivo-aprendizagem")
public class ObjetivoAprendizagemController {
	
	@GetMapping
	public String ObjetivoAprendizagem() {
		return "Objetivos de aprendizagem da semana:<br>Banco de dados<br>Diagrama DER<br>Desenvolvimento com Spring Boot";
}
}