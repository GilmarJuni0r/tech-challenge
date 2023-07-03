package com.fiap.techchallenge.person.domain;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Builder
@ToString
@EqualsAndHashCode(of = {"cpf"})
public class Person {
	
	@Setter
	private Long id;

	private String name;
	private String cpf;
	private LocalDate birthDate;
	private String gender;	
	private List<Relative> relatives;
	
}
