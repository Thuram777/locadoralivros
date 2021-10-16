package com.wdatecnologia.locadoralivros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wdatecnologia.locadoralivros.model.Aluguel;
import org.springframework.stereotype.Repository;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Long> {

	Aluguel findById(long id);
	
}