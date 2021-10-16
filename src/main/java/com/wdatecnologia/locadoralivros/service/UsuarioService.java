package com.wdatecnologia.locadoralivros.service;

import com.wdatecnologia.locadoralivros.dto.UsuarioDTO;
import com.wdatecnologia.locadoralivros.exception.UsuarioExistenteException;
import com.wdatecnologia.locadoralivros.mapper.UsuarioMapper;
import com.wdatecnologia.locadoralivros.model.Usuario;
import com.wdatecnologia.locadoralivros.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final static UsuarioMapper usuarioMapper = UsuarioMapper.INSTANCE;

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioDTO create(UsuarioDTO usuarioDTO){
        verificaExiste(usuarioDTO.getNome());
        Usuario usuario = usuarioMapper.toModel(usuarioDTO);
        Usuario criacaoUsuario = usuarioRepository.save(usuario);
        return usuarioMapper.toDTO(criacaoUsuario);
    }

    public void verificaExiste(String usuarioNome){
       usuarioRepository.findByNome(usuarioNome)
                .ifPresent(usuario ->
                {throw new UsuarioExistenteException(usuarioNome);});
    }
}
