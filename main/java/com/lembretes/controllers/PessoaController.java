package com.lembretes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.lembretes.entities.Pessoa;
import com.lembretes.services.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	private PessoaService service;

	@GetMapping()
	public ResponseEntity<List<Pessoa>> findAll() {
		try {
			return ResponseEntity.ok(service.findAll());
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

}
