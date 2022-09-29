package com.helloworld.helloworld.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* ATtividade 1: Crie um projeto Spring que possua 3 endpoints:

O primeiro endpoint deverá exibir a mensagem: Hello World!
O segundo endpoint deverá exibir a lista de BSM’s da Generation Brasil.
O terceiro endpoint deverá exibir uma lista contendo os seus Objetivos de aprendizagem desta semana. */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
}
