package com.wdatecnologia.locadoralivros.controller;

import com.wdatecnologia.locadoralivros.dto.LivroDTO;
import com.wdatecnologia.locadoralivros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/livro")
public class LivroController implements LivroControllerDocs{

    private LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LivroDTO create(@RequestBody @Valid LivroDTO livroDTO) {
        return livroService.create(livroDTO);
    }

}

