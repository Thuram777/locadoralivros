package com.wdatecnologia.locadoralivros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wdatecnologia.locadoralivros.model.Editora;

import java.util.Optional;

public interface EditoraRepository extends JpaRepository<Editora, Long> {

	Editora findById(long id);

    Optional <Editora> findByNome(String nome);
}
