package com.wdatecnologia.locadoralivros.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private long id;

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String nome;

    @NotNull
    @NotEmpty
    private String endereco;

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String cidade;

    @Email
    private String email;
}
