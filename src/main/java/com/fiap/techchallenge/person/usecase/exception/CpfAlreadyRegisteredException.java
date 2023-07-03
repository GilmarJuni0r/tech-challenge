package com.fiap.techchallenge.person.usecase.exception;

import com.fiap.techchallenge.common.exception.SystemBaseException;

import lombok.Getter;

@Getter
public class CpfAlreadyRegisteredException extends SystemBaseException {
	private static final long serialVersionUID = 4012200300232962702L;

	private final String code = "tc.person.CpfAlreadyRegistered";
	private final String message = "CPF já cadastrado";
	private final Integer httpStatus = 422;
	
}
