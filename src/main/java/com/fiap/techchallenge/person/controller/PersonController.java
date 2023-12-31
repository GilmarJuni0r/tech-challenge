package com.fiap.techchallenge.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.techchallenge.person.controller.json.PersonJson;
import com.fiap.techchallenge.person.domain.Person;
import com.fiap.techchallenge.person.usecase.PersonUseCase;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/people")
@RestController
public class PersonController {
	
	@Autowired
	private PersonUseCase personUseCase;

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Long create(
			@Valid @RequestBody PersonJson personJson) {
		log.trace("Start personJson={}", personJson);
		
		Person person = personJson.toPerson();
		
		Long personId = personUseCase.create(person);

		log.trace("End personId={}", personId);
		return personId;
	}
}
