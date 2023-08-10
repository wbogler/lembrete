package com.lembretes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lembretes.entities.Pessoa;
import com.lembretes.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> findAll(){
		return repository.findAll();
	}

}
