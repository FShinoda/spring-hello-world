package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class GenerationBsmController {
	
	@GetMapping
	public String bsm() {
		return "comunicação, "
				+ "trabalho em equipe, "
				+ "mentalidade de crescimento, "
				+ "proatividade, "
				+ "atenção aos detalhes, "
				+ "gerenciamento do tempo, "
				+ "persistencia";
	}

}
