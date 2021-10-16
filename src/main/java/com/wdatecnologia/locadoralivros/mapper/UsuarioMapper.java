package com.wdatecnologia.locadoralivros.mapper;

import com.wdatecnologia.locadoralivros.dto.UsuarioDTO;
import com.wdatecnologia.locadoralivros.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    Usuario toModel(UsuarioDTO usuarioDTO);

    UsuarioDTO toDTO(Usuario usuario);
}
