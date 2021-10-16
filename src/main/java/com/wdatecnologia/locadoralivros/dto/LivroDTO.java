package com.wdatecnologia.locadoralivros.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LivroDTO {

    private long id;

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String nome;

    @NotNull
    @NotEmpty
    private LocalDate lancamento;

    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String autor;

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @NotNull
    private Integer quantidade;


}
