package com.wdatecnologia.locadoralivros.controller;

import com.wdatecnologia.locadoralivros.dto.EditoraDTO;
import com.wdatecnologia.locadoralivros.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/editora")
public class EditoraController implements EditoraControllerDocs{

    private EditoraService editoraService;

    @Autowired
    public EditoraController(EditoraService editoraService) {
        this.editoraService = editoraService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EditoraDTO create(@RequestBody @Valid EditoraDTO editoraDTO) {
        return editoraService.create(editoraDTO);
    }
}
