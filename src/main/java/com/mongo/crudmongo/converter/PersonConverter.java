package com.mongo.crudmongo.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.mongo.crudmongo.dto.PersonDto;
import com.mongo.crudmongo.model.Person;

@Component
public class PersonConverter {

	public PersonDto toDto(Person entity) {
		PersonDto dto = new PersonDto();
		dto.setId(entity.getId());
		dto.setLastName(entity.getLastName());
		dto.setName(entity.getName());
		dto.setAge(entity.getAge());
		dto.setDateCreated(entity.getDateCreated());
		return dto;
	}

	public List<PersonDto> toDtoList(List<Person> entities) {

		return entities.stream().map(this::toDto).collect(Collectors.toList());
	}
}
