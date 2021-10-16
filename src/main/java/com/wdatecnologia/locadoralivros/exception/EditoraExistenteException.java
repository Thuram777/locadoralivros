package com.wdatecnologia.locadoralivros.exception;

import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;

import javax.persistence.EntityExistsException;

public class EditoraExistenteException extends EntityExistsException {

    public EditoraExistenteException(String nome) {
        super(String.format("Já existe um autor com esse com o nome:", nome));
    }
}
