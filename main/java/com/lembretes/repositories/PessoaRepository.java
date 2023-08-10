package com.lembretes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lembretes.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
