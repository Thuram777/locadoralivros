package com.wdatecnologia.locadoralivros.service;

import com.wdatecnologia.locadoralivros.dto.LivroDTO;
import com.wdatecnologia.locadoralivros.exception.LivroExistenteException;
import com.wdatecnologia.locadoralivros.mapper.LivroMapper;
import com.wdatecnologia.locadoralivros.model.Livro;
import com.wdatecnologia.locadoralivros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    private final static LivroMapper livroMapper = LivroMapper.INSTANCE;

    private LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public LivroDTO create(LivroDTO livroDTO){
        verificaExiste(livroDTO.getNome());
        Livro livro = livroMapper.toModel(livroDTO);
        Livro criacaoLivro = livroRepository.save(livro);
        return livroMapper.toDTO(criacaoLivro);

    }

    public void verificaExiste(String livroNome){
        livroRepository.findByNome(livroNome)
                .ifPresent(livro ->
                {throw new LivroExistenteException(livroNome);});
    }
}

