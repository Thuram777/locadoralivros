package com.wdatecnologia.locadoralivros.mapper;

import com.wdatecnologia.locadoralivros.dto.LivroDTO;
import com.wdatecnologia.locadoralivros.model.Livro;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LivroMapper {

    LivroMapper INSTANCE = Mappers.getMapper(LivroMapper.class);

    Livro toModel(LivroDTO livroDTO);

    LivroDTO toDTO(Livro livro);

}
