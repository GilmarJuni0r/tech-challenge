package com.fiap.techchallenge.homeAppliance.usecase.exception;

import com.fiap.techchallenge.common.exception.SystemBaseException;
import lombok.Getter;

@Getter
public class IllegalArgumentVoltageException extends SystemBaseException {
    private static final long serialVersionUID = 4012200300232962702L;

    private final String code = "tc.homeAppliance.IllegalArgumentVoltage";
    private final String message = "Voltagem inválida, insira 110 ou 220";
    private final Integer httpStatus = 422;
}
