package com.wdatecnologia.locadoralivros.model;

import com.wdatecnologia.locadoralivros.entidade.Auditavel;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
public class Aluguel extends Auditavel implements Serializable {
	
		
	private static final long serialVersionUID = 1L ;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDate dataAluguel;

	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDate dataPrevisao;

	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDate dataDevolucao;

	@OneToOne
	private Usuario usuario;

	@OneToOne
	private Livro livro;

}
