package com.fiap.techchallenge.person.controller.json;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

import com.fiap.techchallenge.person.domain.Person;
import com.fiap.techchallenge.person.domain.Relative;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PersonJson {
	
	@NotBlank
	private String name;
	
	@NotNull
	@CPF
	private String cpf;
	
	@Past
	private LocalDate birthDate;

	@NotBlank
	private String gender;
	private List<RelativeJson> relatives;
	
	public Person toPerson() {
		List<Relative> relativesDomain = new ArrayList<>();
		if(relatives != null) {
			relativesDomain = relatives.stream().map(r -> r.toRelative()).toList();
		}
		
		return Person.builder()
				.name(name)
				.cpf(removeMask(cpf))
				.birthDate(birthDate)
				.gender(gender)
				.relatives(relativesDomain) 
				.build();
	}
	
	private String removeMask(String cpf) {
		return cpf.replace(".", "").replace("-", "").replace(" ", "");
	}
}
