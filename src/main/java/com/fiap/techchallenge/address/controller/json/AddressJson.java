package com.fiap.techchallenge.address.controller.json;

import com.fiap.techchallenge.address.domain.Address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class AddressJson {

	@NotBlank
    private String street;

	@NotBlank
    private String number;

	@NotBlank
    private String neighborhood;

	@NotBlank
    private String city;

	@NotNull
	@Pattern(regexp = "^[A-Z]{2}$", message = "Insira apenas a sigla do estado, ex: RJ")
    private String state;

    public Address toAddress() {
        return Address.builder()
        		.street(street)
				.number(number)
				.neighborhood(neighborhood)
				.city(city)
				.state(state)
        		.build();
    }
}
