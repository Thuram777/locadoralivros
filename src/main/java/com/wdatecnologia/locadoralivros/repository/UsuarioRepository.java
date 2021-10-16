package com.wdatecnologia.locadoralivros.repository;

import com.wdatecnologia.locadoralivros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wdatecnologia.locadoralivros.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findById(long id);

	Optional<Usuario> findByNome(String nome);
}

