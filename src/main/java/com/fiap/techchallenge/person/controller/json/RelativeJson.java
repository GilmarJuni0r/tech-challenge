package com.fiap.techchallenge.person.controller.json;

import com.fiap.techchallenge.person.domain.Relative;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RelativeJson {
	
	private String name;
	private String parentage;
	private String gender;

	public Relative toRelative() {
		return Relative.builder()
				.name(name)
				.parentage(parentage)
				.gender(gender)
				.build();
	}
}
