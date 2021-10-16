package com.wdatecnologia.locadoralivros.mapper;

import com.wdatecnologia.locadoralivros.dto.EditoraDTO;
import com.wdatecnologia.locadoralivros.model.Editora;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EditoraMapper {

    EditoraMapper INSTANCE = Mappers.getMapper(EditoraMapper.class);

    Editora toModel(EditoraDTO editoraDTO);

    EditoraDTO toDTO(Editora editora);
}
