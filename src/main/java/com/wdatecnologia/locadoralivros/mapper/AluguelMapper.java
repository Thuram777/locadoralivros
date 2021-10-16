package com.wdatecnologia.locadoralivros.mapper;

import com.wdatecnologia.locadoralivros.dto.AluguelDTO;
import com.wdatecnologia.locadoralivros.model.Aluguel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AluguelMapper {

    AluguelMapper INSTANCE = Mappers.getMapper(AluguelMapper.class);

    Aluguel toModel(AluguelDTO aluguelDTO);

    AluguelDTO toDTO(Aluguel aluguel);
}
