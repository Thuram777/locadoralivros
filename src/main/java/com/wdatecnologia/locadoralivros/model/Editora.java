package com.wdatecnologia.locadoralivros.model;

import com.wdatecnologia.locadoralivros.entidade.Auditavel;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Editora extends Auditavel implements Serializable{

	private static final long serialVersionUID = 1L ;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false, unique = true)
	private String nome;

	@Column(nullable = false)
	private String cidade;

}
