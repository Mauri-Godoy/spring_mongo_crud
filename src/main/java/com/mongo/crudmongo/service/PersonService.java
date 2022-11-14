package com.mongo.crudmongo.service;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mongo.crudmongo.dto.PersonDto;

public interface PersonService {

	ResponseEntity<String> create();

	List<PersonDto> getAll();

	List<PersonDto> getByAge(int age);

	List<PersonDto> getByDate(Date dateFrom, Date dateTo);

	List<PersonDto> getByName(String name);

}
