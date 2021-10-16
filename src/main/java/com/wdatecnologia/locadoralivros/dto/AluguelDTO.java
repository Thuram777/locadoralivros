package com.wdatecnologia.locadoralivros.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AluguelDTO {

    private long id;


    @NotNull
    @NotEmpty
    private LocalDate dataAluguel;

    @NotNull
    @NotEmpty
    private LocalDate dataPrevisao;

    @NotNull
    @NotEmpty
    private LocalDate dataDevolucao;

}
