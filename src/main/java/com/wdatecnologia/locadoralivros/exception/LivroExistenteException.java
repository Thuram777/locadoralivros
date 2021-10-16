package com.wdatecnologia.locadoralivros.exception;

import javax.persistence.EntityExistsException;

public class LivroExistenteException extends EntityExistsException {

    public LivroExistenteException(String nome) {
        super(String.format("Já existe um livro cadastrado com esse nome:", nome));
    }
}
