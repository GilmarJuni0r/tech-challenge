package com.fiap.techchallenge.person.gateway.exception;

import com.fiap.techchallenge.common.exception.SystemBaseException;

import lombok.Getter;

@Getter
public class ErrorToAccessDatabaseException extends SystemBaseException{
	private static final long serialVersionUID = -1738985112058252461L;

	private final String code = "tc.person.errorToAccessDatabase";
	private final String message = "Erro ao tentar acessar o banco de dados";
	private final Integer httpStatus = 500;

}
