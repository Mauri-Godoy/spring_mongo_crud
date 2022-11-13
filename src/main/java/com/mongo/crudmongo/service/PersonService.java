package com.mongo.crudmongo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mongo.crudmongo.dto.PersonDto;

public interface PersonService {

	ResponseEntity<String> create();

	List<PersonDto> getAll();

	List<PersonDto> getByAge(int age);

}
