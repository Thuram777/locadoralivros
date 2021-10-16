package com.wdatecnologia.locadoralivros.service;

import com.wdatecnologia.locadoralivros.dto.AluguelDTO;
import com.wdatecnologia.locadoralivros.mapper.AluguelMapper;
import com.wdatecnologia.locadoralivros.model.Aluguel;
import com.wdatecnologia.locadoralivros.repository.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AluguelService {

    private final static AluguelMapper aluguelMapper = AluguelMapper.INSTANCE;

    private AluguelRepository aluguelRepository;

    @Autowired
    public AluguelService(AluguelRepository aluguelRepository) {
        this.aluguelRepository = aluguelRepository;
    }

    public AluguelDTO create(AluguelDTO aluguelDTO){
        Aluguel aluguel = aluguelMapper.toModel(aluguelDTO);
        Aluguel criacaoAluguel = aluguelRepository.save(aluguel);
        return aluguelMapper.toDTO(criacaoAluguel);

    }
}
