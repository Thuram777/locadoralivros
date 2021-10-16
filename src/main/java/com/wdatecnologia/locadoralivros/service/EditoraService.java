package com.wdatecnologia.locadoralivros.service;

import com.wdatecnologia.locadoralivros.dto.EditoraDTO;
import com.wdatecnologia.locadoralivros.exception.EditoraExistenteException;
import com.wdatecnologia.locadoralivros.mapper.EditoraMapper;
import com.wdatecnologia.locadoralivros.model.Editora;
import com.wdatecnologia.locadoralivros.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditoraService {
    private final static EditoraMapper editoraMapper = EditoraMapper.INSTANCE;

    private EditoraRepository editoraRepository;

    @Autowired
    public EditoraService(EditoraRepository editoraRepository) {
        this.editoraRepository = editoraRepository;
    }

    public EditoraDTO create(EditoraDTO editoraDTO){
        verificaExiste(editoraDTO.getNome());
        Editora editora = editoraMapper.toModel(editoraDTO);
        Editora criacaoEditora = editoraRepository.save(editora);
        return editoraMapper.toDTO(criacaoEditora);
    }

    private void verificaExiste(String editoraNome) {
        editoraRepository.findByNome(editoraNome)
                .ifPresent(editora ->
                {throw new EditoraExistenteException(editoraNome);});
    }
}

