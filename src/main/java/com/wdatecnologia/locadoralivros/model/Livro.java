package com.wdatecnologia.locadoralivros.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wdatecnologia.locadoralivros.entidade.Auditavel;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
public class Livro extends Auditavel implements Serializable{
	
	private static final long serialVersionUID = 1L ;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false, unique = true)
	private String nome;

	@Column(nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
	private LocalDate lancamento;

	@Column(nullable = false, unique = true)
	private String autor;

	@ManyToOne
	private Editora editora;

	@Column(nullable = false)
	private int quantidade;

}
