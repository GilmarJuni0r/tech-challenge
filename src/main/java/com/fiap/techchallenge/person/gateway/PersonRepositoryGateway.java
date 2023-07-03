package com.fiap.techchallenge.person.gateway;

import java.util.Optional;

import com.fiap.techchallenge.person.domain.Person;

public interface PersonRepositoryGateway {
	
	public Long create(Person person);

	public Optional<Person> getByCpf(String cpf);

}
