package com.wdatecnologia.locadoralivros.controller;

import com.wdatecnologia.locadoralivros.dto.AluguelDTO;
import com.wdatecnologia.locadoralivros.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/aluguel")
public class AluguelController implements AluguelControllerDocs{

    private AluguelService aluguelService;

    @Autowired
    public AluguelController(AluguelService aluguelService) {
        this.aluguelService = aluguelService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AluguelDTO create(@RequestBody @Valid AluguelDTO aluguelDTO) {
        return aluguelService.create(aluguelDTO);
    }
}
