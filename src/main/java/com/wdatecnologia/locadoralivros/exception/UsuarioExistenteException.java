package com.wdatecnologia.locadoralivros.exception;

import javax.persistence.EntityExistsException;

public class UsuarioExistenteException extends EntityExistsException {

    public UsuarioExistenteException(String nome) {
        super(String.format("Já existe um usuario cadastrado com esse nome:", nome));
    }
}
