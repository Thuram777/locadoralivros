package com.wdatecnologia.locadoralivros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wdatecnologia.locadoralivros.model.Livro;

import java.util.Optional;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	
	Livro findById(long id);

	Optional <Livro> findByNome(String nome);
}
